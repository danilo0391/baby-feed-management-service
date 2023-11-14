package com.babyfeed.managementservice.repository;

import com.babyfeed.managementservice.model.Baby;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BabyRepository extends JpaRepository<Baby, Long> {
    Page<Baby> findAllByActiveTrue(Pageable pagination);
}
