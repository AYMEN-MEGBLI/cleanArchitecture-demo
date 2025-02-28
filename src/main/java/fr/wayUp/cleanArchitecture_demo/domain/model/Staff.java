package fr.wayUp.cleanArchitecture_demo.domain.model;

import jakarta.persistence.Column;
import lombok.*;

import java.time.LocalDate;

@Builder
@Getter
@Setter
public class Staff {
    private Long id;
    private String firstName;
    private String lastName;
    private Boolean inService;
    private LocalDate hireDate;
    private LocalDate birthDate;
    private String role;
    private String address;
    private String phone;
    private String email;
}