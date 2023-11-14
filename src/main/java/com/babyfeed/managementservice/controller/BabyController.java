package com.babyfeed.managementservice.controller;

import com.babyfeed.managementservice.dto.ListOfBabiesDTO;
import com.babyfeed.managementservice.dto.RegisterBabyDTO;
import com.babyfeed.managementservice.dto.UpdateBabyDTO;
import com.babyfeed.managementservice.model.Baby;
import com.babyfeed.managementservice.repository.BabyRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("babies")
public class BabyController {

    @Autowired
    private BabyRepository repository;

    @PostMapping
    @Transactional
    public void registerNewBaby(@RequestBody @Valid RegisterBabyDTO baby){
        repository.save(new Baby(baby));

    }

    @GetMapping
    public Page listBabies(@PageableDefault(size = 10, sort = {"name"})Pageable pagination){
        return repository.findAllByActiveTrue(pagination).map(ListOfBabiesDTO::new);
    }

    @PutMapping
    @Transactional
    public void update(@RequestBody @Valid UpdateBabyDTO data){
        var baby = repository.getReferenceById(data.id());
        baby.updateInfo(data);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void delete(@PathVariable Long id){
        var baby = repository.getReferenceById(id);
        baby.delete();
    }

}
