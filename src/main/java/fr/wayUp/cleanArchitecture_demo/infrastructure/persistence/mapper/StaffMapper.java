package fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.mapper;

import fr.wayUp.cleanArchitecture_demo.domain.model.Staff;
import fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.entity.StaffEntity;
import fr.wayUp.cleanArchitecture_demo.web.DTO.StaffDTO;

import java.util.List;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

public class StaffMapper {
   public static Staff toDomain(StaffEntity staffEntity){
       requireNonNull(staffEntity, "staff entity should not be null!");
       return Staff.builder()
               .id(staffEntity.getId())
               .firstName(staffEntity.getFirstName())
               .lastName(staffEntity.getLastName())
               .inService(staffEntity.getInService())
               .hireDate(staffEntity.getHireDate())
               .birthDate(staffEntity.getBirthDate())
               .role(staffEntity.getRole())
               .address(staffEntity.getAddress())
               .phone(staffEntity.getPhone())
               .email(staffEntity.getEmail())
               .build();
   }
    public static Staff toDomain(StaffDTO staffDTO){
        requireNonNull(staffDTO  , "staff DTO should not be null!");
        return Staff.builder()
                .id(staffDTO.getId())
                .firstName(staffDTO.getFirstName())
                .lastName(staffDTO.getLastName())
                .inService(staffDTO.getInService())
                .hireDate(staffDTO.getHireDate())
                .birthDate(staffDTO.getBirthDate())
                .role(staffDTO.getRole())
                .address(staffDTO.getAddress())
                .phone(staffDTO.getPhone())
                .email(staffDTO.getEmail())
                .build();
    }
    public static StaffEntity toEntity(Staff staff){
        requireNonNull(staff, "staff  should not be null!");
        return StaffEntity.builder()
                .id(staff.getId())
                .firstName(staff.getFirstName())
                .lastName(staff.getLastName())
                .inService(staff.getInService())
                .hireDate(staff.getHireDate())
                .birthDate(staff.getBirthDate())
                .role(staff.getRole())
                .address(staff.getAddress())
                .phone(staff.getPhone())
                .email(staff.getEmail())
                .build();
    }
    public static StaffEntity toEntity(StaffDTO staffDTO){
        requireNonNull(staffDTO, "staff DTO  should not be null!");
        return StaffEntity.builder()
                .id(staffDTO.getId())
                .firstName(staffDTO.getFirstName())
                .lastName(staffDTO.getLastName())
                .inService(staffDTO.getInService())
                .hireDate(staffDTO.getHireDate())
                .birthDate(staffDTO.getBirthDate())
                .role(staffDTO.getRole())
                .address(staffDTO.getAddress())
                .phone(staffDTO.getPhone())
                .email(staffDTO.getEmail())
                .build();
    }
    public static StaffDTO toDTO(Staff staff){
        requireNonNull(staff, "staff  should not be null!");
        return StaffDTO.builder()
                .id(staff.getId())
                .firstName(staff.getFirstName())
                .lastName(staff.getLastName())
                .inService(staff.getInService())
                .hireDate(staff.getHireDate())
                .birthDate(staff.getBirthDate())
                .role(staff.getRole())
                .address(staff.getAddress())
                .phone(staff.getPhone())
                .email(staff.getEmail())
                .build();
    }


    public static List<StaffDTO> EntityToDTO(List<StaffEntity> staff){

        return  staff.stream().map(StaffMapper::toDTO).toList() ;
    }
    public static List<StaffDTO> staffToDTO(List<Staff> staff){

        return  staff.stream().map(StaffMapper::toDTO).toList() ;
    }
    public static StaffDTO toDTO(StaffEntity staffEntity){
        requireNonNull(staffEntity, "staff entity should not be null!");
        return StaffDTO.builder()
                .id(staffEntity.getId())
                .firstName(staffEntity.getFirstName())
                .lastName(staffEntity.getLastName())
                .inService(staffEntity.getInService())
                .hireDate(staffEntity.getHireDate())
                .birthDate(staffEntity.getBirthDate())
                .role(staffEntity.getRole())
                .address(staffEntity.getAddress())
                .phone(staffEntity.getPhone())
                .email(staffEntity.getEmail())
                .build();
    }



}
