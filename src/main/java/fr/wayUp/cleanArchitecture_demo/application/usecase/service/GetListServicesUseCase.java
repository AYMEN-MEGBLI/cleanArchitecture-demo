package fr.wayUp.cleanArchitecture_demo.application.usecase.service;
import fr.wayUp.cleanArchitecture_demo.domain.model.Service;
import fr.wayUp.cleanArchitecture_demo.domain.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class GetListServicesUseCase {
    private final ServiceRepository serviceRepository ;
@Autowired
    public GetListServicesUseCase(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }
    public List<Service>  execute(){
        return this.serviceRepository.findAllServices();
    }
}
