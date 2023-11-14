package com.babyfeed.managementservice.dto;

import com.babyfeed.managementservice.enums.Gender;
import com.babyfeed.managementservice.model.Baby;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDate;

public record ListOfBabiesDTO(
        Long id,
        String name,

        @JsonFormat(pattern="dd/MM/yyyy")
        LocalDate dateOfBirth,

        Gender gender
) {
        public ListOfBabiesDTO(Baby baby) {
                this(baby.getId(), baby.getName(), baby.getDateOfBirth(), baby.getGender());
        }

}
