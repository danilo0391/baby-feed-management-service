package com.babyfeed.managementservice.dto;

import com.babyfeed.managementservice.enums.Gender;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record UpdateBabyDTO(
        @NotNull
        Long id,
        String name,
        @JsonFormat(pattern="dd/MM/yyyy")
        LocalDate dateOfBirth,
        Gender gender
) {
}
