package fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.mapper;

import fr.wayUp.cleanArchitecture_demo.domain.model.Service;
import fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.entity.ServiceEntity;

import fr.wayUp.cleanArchitecture_demo.web.DTO.ServiceDTO;

public class ServiceMapper {

    public static Service toDomain(ServiceEntity serviceEntity) {
        if (serviceEntity == null) {
            return null;
        }
        return Service.builder()
                .id(serviceEntity.getId())
                .speciality(serviceEntity.getSpeciality())
                .responsible(StaffMapper.toDomain(serviceEntity.getResponsible()))
                .build();
    }

    public static Service toDomain(ServiceDTO serviceDTO) {
        if (serviceDTO == null) {
            return null;
        }
        return Service.builder()
                .id(serviceDTO.getId())
                .speciality(serviceDTO.getSpeciality())
                .responsible(serviceDTO.getResponsible())
                .build();
    }

    public static ServiceEntity toEntity(Service service) {
        if (service == null) {
            return null;
        }
        return ServiceEntity.builder()
                .id(service.getId())
                .speciality(service.getSpeciality())
                .responsible(StaffMapper.toEntity( service.getResponsible()))
                .build();
    }

    public static ServiceEntity toEntity(ServiceDTO serviceDTO) {
        if (serviceDTO == null) {
            return null;
        }
        return ServiceEntity.builder()
                .id(serviceDTO.getId())
                .speciality(serviceDTO.getSpeciality())
                .responsible(StaffMapper.toEntity(serviceDTO.getResponsible()))
                .build();
    }

    public static ServiceDTO toDTO(Service service) {
        if (service == null) {
            return null;
        }
        return ServiceDTO.builder()
                .id(service.getId())
                .speciality(service.getSpeciality())
                .responsible(service.getResponsible())
                .build();
    }

    public static ServiceDTO toDTO(ServiceEntity serviceEntity) {
        if (serviceEntity == null) {
            return null;
        }
        return ServiceDTO.builder()
                .id(serviceEntity.getId())
                .speciality(serviceEntity.getSpeciality())
                .responsible(StaffMapper.toDomain(serviceEntity.getResponsible()))
                .build();
    }
}
