package com.babyfeed.managementservice.model;

import com.babyfeed.managementservice.enums.Gender;
import jakarta.annotation.Generated;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenerationTime;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.Date;

@Table(name = "babies")
@Entity(name = "Baby")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Baby {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private LocalDateTime dateOfBirth;
    @NotNull
    @Enumerated(EnumType.STRING)
    private Gender gender;
}
