package fr.wayUp.cleanArchitecture_demo.web.controller;

import fr.wayUp.cleanArchitecture_demo.application.service.ServiceService;
import fr.wayUp.cleanArchitecture_demo.domain.model.Service;
import fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.mapper.ServiceMapper;
import fr.wayUp.cleanArchitecture_demo.web.DTO.ServiceDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/service")
@RequiredArgsConstructor
public class ServiceController {

    private final ServiceService serviceService;

    @GetMapping
    public List<ServiceDTO> getAllService() {
        return serviceService.getAllService()
                .stream()
                .map(ServiceMapper :: toDTO)
                .toList();
    }

    @GetMapping("/{id}")
    public Optional<ServiceDTO> getServiceById(@PathVariable Long id) {
        return serviceService.getServiceById(id);
    }

    @PostMapping("/addService")
    public ServiceDTO createService(@RequestBody ServiceDTO serviceDTO) {;
        return serviceService.createService(serviceDTO);
    }

    @DeleteMapping("/{id}")
    public void  deleteService(@PathVariable Long id) {
        serviceService.deleteService(id);
    }
}
