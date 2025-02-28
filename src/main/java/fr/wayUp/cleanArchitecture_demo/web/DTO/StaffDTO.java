package fr.wayUp.cleanArchitecture_demo.web.DTO;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Builder
@Getter
@Setter
public class StaffDTO {
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
