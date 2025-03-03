package fr.wayUp.cleanArchitecture_demo.application.usecase.service;
import fr.wayUp.cleanArchitecture_demo.domain.repository.ServiceRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class DeleteServiceUseCase {
    private final ServiceRepository serviceRepository ;
    @Autowired
    public DeleteServiceUseCase(ServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }

    public void delete(Long id){
        this.serviceRepository.deleteServiceById(id);
    }
}
