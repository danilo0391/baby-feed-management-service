package com.babyfeed.managementservice.model;

import com.babyfeed.managementservice.dto.RegisterBabyDTO;
import com.babyfeed.managementservice.dto.UpdateBabyDTO;
import com.babyfeed.managementservice.enums.Gender;
import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Table(name = "babies")
@Entity(name = "Baby")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Baby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @JsonFormat(pattern="dd/MM/yyyy")
    @NotNull
    private LocalDate dateOfBirth;

    @Enumerated(EnumType.STRING)
    @NotNull
    private Gender gender;
    private Boolean active;

    public Baby(RegisterBabyDTO data){
        this.name = data.name();
        this.dateOfBirth = data.dateOfBirth();
        this.gender = data.gender();
        this.active = true;
    }

    public void updateInfo(UpdateBabyDTO data) {
        if(data.name() != null){
            this.name = data.name();
        }
        if(data.dateOfBirth() != null){
            this.dateOfBirth = data.dateOfBirth();
        }
        if(data.gender() != null){
            this.gender = data.gender();
        }
    }

    public void delete() {
        this.active = false;
    }
}
