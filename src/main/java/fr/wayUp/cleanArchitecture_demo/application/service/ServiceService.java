package fr.wayUp.cleanArchitecture_demo.application.service;
import  fr.wayUp.cleanArchitecture_demo.application.usecase.service.*;
import fr.wayUp.cleanArchitecture_demo.domain.model.Service;
import fr.wayUp.cleanArchitecture_demo.web.DTO.ServiceDTO;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.Optional;
@org.springframework.stereotype.Service
public class ServiceService {
    private  final  GetServiceUseCase getServiceUseCase;
    private  final  GetListServicesUseCase getListServicesUseCase ;
    private  final DeleteServiceUseCase deleteServiceUseCase ;
    private  final SaveServiceUseCase saveServiceUseCase;
@Autowired
    public ServiceService(GetServiceUseCase getServiceUseCase, GetListServicesUseCase getListServicesUseCase, DeleteServiceUseCase deleteServiceUseCase, SaveServiceUseCase saveServiceUseCase) {
        this.getServiceUseCase = getServiceUseCase;
        this.getListServicesUseCase = getListServicesUseCase;
        this.deleteServiceUseCase = deleteServiceUseCase;
        this.saveServiceUseCase = saveServiceUseCase;
    }
    public List<Service> getAllService() {
        return this.getListServicesUseCase.execute();
    }
    public Optional<ServiceDTO> getServiceById(Long id) {
        return this.getServiceUseCase.find(id);
    }
    public ServiceDTO createService(ServiceDTO serviceDTO) {
        return this.saveServiceUseCase.create(serviceDTO);
    }

    public void deleteService(Long id) {
        this.deleteServiceUseCase.delete(id);
    }
}
