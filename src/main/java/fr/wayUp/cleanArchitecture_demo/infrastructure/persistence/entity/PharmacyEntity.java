package fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Table(name="pharmacy")
@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Setter
public class PharmacyEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(name = "medication_id")
    private Long medicationId;
    @Column(name ="stock_quantity")
    private int stockQuantity ;
    @Column(name ="expiration_date")
    private Date expirationDate ;

}
