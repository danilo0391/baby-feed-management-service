package com.babyfeed.managementservice.repository;

import com.babyfeed.managementservice.model.Baby;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BabyRepository extends JpaRepository<Baby, Long> {
}
