package fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.mapper;

import fr.wayUp.cleanArchitecture_demo.domain.model.Pharmacy;
import fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.entity.PharmacyEntity;
import fr.wayUp.cleanArchitecture_demo.web.DTO.PharmacyDTO;

import static java.util.Objects.requireNonNull;

public class PharmacyMapper {
    public static PharmacyEntity toEntity(Pharmacy pharmacy){
        requireNonNull(pharmacy, "Pharmacy should not be null!");
        return PharmacyEntity.builder()
                .id(pharmacy.getId())
                .medicationId(pharmacy.getMedicationId())
                .stockQuantity(pharmacy.getStockQuantity())
                .expirationDate(pharmacy.getExpirationDate())
                .build();
    }
    public static PharmacyEntity toEntity(PharmacyDTO pharmacy){
        requireNonNull(pharmacy, "PharmacyDTO should not be null!");
        return PharmacyEntity.builder()
                .id(pharmacy.getId())
                .medicationId(pharmacy.getMedicationId())
                .stockQuantity(pharmacy.getStockQuantity())
                .expirationDate(pharmacy.getExpirationDate())
                .build();
    }


    public  static  Pharmacy toDomain(PharmacyEntity pharmacy){
        requireNonNull(pharmacy, "PharmacyEntity should not be null!");
        return Pharmacy.builder()
                .id(pharmacy.getId())
                .expirationDate(pharmacy.getExpirationDate())
                .medicationId(pharmacy.getMedicationId())
                .stockQuantity(pharmacy.getStockQuantity())
                .build() ;

    }

    public  static  Pharmacy toDomain(PharmacyDTO pharmacy){
        requireNonNull(pharmacy, "PharmacyDTO should not be null!");
        return Pharmacy.builder()
                .id(pharmacy.getId())
                .expirationDate(pharmacy.getExpirationDate())
                .medicationId(pharmacy.getMedicationId())
                .stockQuantity(pharmacy.getStockQuantity())
                .build() ;
    }



    public static PharmacyDTO toDTO(PharmacyEntity pharmacy){
        requireNonNull(pharmacy, "Pharmacy Entity should not be null!");
        return  PharmacyDTO.builder()
                .id(pharmacy.getId())
                .expirationDate(pharmacy.getExpirationDate())
                .medicationId(pharmacy.getMedicationId())
                .stockQuantity(pharmacy.getStockQuantity())
                .build();
    }
    public static PharmacyDTO toDTO(Pharmacy pharmacy){
        requireNonNull(pharmacy, "Pharmacy should not be null!");
        return  PharmacyDTO.builder()
                .id(pharmacy.getId())
                .expirationDate(pharmacy.getExpirationDate())
                .medicationId(pharmacy.getMedicationId())
                .stockQuantity(pharmacy.getStockQuantity())
                .build();
    }
}
