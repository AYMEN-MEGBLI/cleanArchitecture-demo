package fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.entity;

import fr.wayUp.cleanArchitecture_demo.domain.model.Staff;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "service")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ServiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String speciality;


    @ManyToOne
    @JoinColumn(name = "responsible_id", referencedColumnName = "id_staff")
    private StaffEntity responsible;
}

