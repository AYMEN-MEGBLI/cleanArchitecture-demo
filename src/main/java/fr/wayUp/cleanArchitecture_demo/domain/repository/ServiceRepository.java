package fr.wayUp.cleanArchitecture_demo.domain.repository;
import fr.wayUp.cleanArchitecture_demo.domain.model.Service;
import fr.wayUp.cleanArchitecture_demo.web.DTO.ServiceDTO;


import java.util.List;
import java.util.Optional;

public interface ServiceRepository {
    ServiceDTO save(ServiceDTO service);
    List<Service> findAllServices();
    Optional<Service> findServiceById(Long id);
    void  deleteServiceById(Long id);

}
