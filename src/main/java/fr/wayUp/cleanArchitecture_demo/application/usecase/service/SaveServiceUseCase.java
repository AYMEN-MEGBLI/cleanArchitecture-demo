package fr.wayUp.cleanArchitecture_demo.application.usecase.service;

import fr.wayUp.cleanArchitecture_demo.domain.repository.ServiceRepository;

import fr.wayUp.cleanArchitecture_demo.web.DTO.ServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;

public class SaveServiceUseCase {
    private final ServiceRepository serviceRepository ;
    @Autowired
    public SaveServiceUseCase(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }
    public ServiceDTO create(ServiceDTO serviceDTO){
            return  this.serviceRepository.save(serviceDTO);
    }
}
