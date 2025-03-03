package fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.repository;

import fr.wayUp.cleanArchitecture_demo.domain.model.Service;
import fr.wayUp.cleanArchitecture_demo.domain.repository.ServiceRepository;
import fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.entity.ServiceEntity;
import fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.mapper.ServiceMapper;
import fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.repository.jpa.ServiceJpaRepository;
import fr.wayUp.cleanArchitecture_demo.web.DTO.ServiceDTO;
import org.apache.catalina.mapper.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class ServiceRepoImp   implements ServiceRepository {
    private final ServiceJpaRepository serviceJpaRepository ;

    public ServiceRepoImp(ServiceJpaRepository serviceJpaRepository) {
        this.serviceJpaRepository = serviceJpaRepository;
    }


    @Override
    public ServiceDTO save(ServiceDTO service) {
        ServiceEntity entity = ServiceMapper.toEntity(service);
        ServiceEntity savedEntity = serviceJpaRepository.save(entity);
        return ServiceMapper.toDTO(savedEntity);
    }

    @Override
    public List<Service> findAllServices() {
        return this.serviceJpaRepository.findAll()
                .stream()
                .map(ServiceMapper :: toDomain)
                .toList();
    }

    @Override
    public Optional<Service> findServiceById(Long id) {
        return this.serviceJpaRepository.findById(id).map(ServiceMapper :: toDomain);
    }

    @Override
    public void deleteServiceById(Long id) {
        if (this.findServiceById(id).isEmpty())
            System.out.println("--------------------- ID does not exist ----------------");
        else
                this.serviceJpaRepository.deleteById(id);
    }
}

