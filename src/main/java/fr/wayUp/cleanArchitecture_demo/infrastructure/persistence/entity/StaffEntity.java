package fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.entity;

import fr.wayUp.cleanArchitecture_demo.domain.model.Staff;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@Entity
@Table(name = "staff")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StaffEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_staff")
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "in_service")
    private Boolean inService;

    @Column(name = "hire_date")
    private LocalDate hireDate;

    @Column(name = "date_of_birth")
    private LocalDate birthDate;

    private String role;
    private String address;
    private String phone;
    private String email;


    @OneToMany(mappedBy = "responsible", cascade = CascadeType.ALL)
    private List<ServiceEntity> services;
}