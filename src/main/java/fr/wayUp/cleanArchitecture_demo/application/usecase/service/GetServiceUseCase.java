package fr.wayUp.cleanArchitecture_demo.application.usecase.service;

import fr.wayUp.cleanArchitecture_demo.domain.model.Service;
import fr.wayUp.cleanArchitecture_demo.domain.repository.ServiceRepository;
import fr.wayUp.cleanArchitecture_demo.web.DTO.ServiceDTO;

import org.springframework.beans.factory.annotation.Autowired;
import fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.mapper.ServiceMapper;
import java.util.Optional;

public class GetServiceUseCase {
    private final ServiceRepository serviceRepository ;
@Autowired
    public GetServiceUseCase(ServiceRepository serviceRepository) {
    this.serviceRepository = serviceRepository;
    }
    public Optional<ServiceDTO> find(Long id){

        Optional<Service>  service  = this.serviceRepository.findServiceById(id);
        if (service.isEmpty())
            return null;
        else
            return  service.map(ServiceMapper :: toDTO);
    }
}
