package fr.wayUp.cleanArchitecture_demo.web.controller;

import fr.wayUp.cleanArchitecture_demo.application.service.PharmacyService;
import fr.wayUp.cleanArchitecture_demo.domain.model.Pharmacy;
import fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.mapper.PharmacyMapper;
import fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.mapper.ServiceMapper;
import fr.wayUp.cleanArchitecture_demo.web.DTO.PharmacyDTO;
import fr.wayUp.cleanArchitecture_demo.web.DTO.ServiceDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pharmacy")
@RequiredArgsConstructor
public class PharmacyController {
    public final PharmacyService pharmacyService ;
    @GetMapping
    public List<PharmacyDTO> getAll() {
        return pharmacyService.findAllPharmacies()
                .stream()
                .map(PharmacyMapper:: toDTO)
                .toList();
    }
    @GetMapping("/{id}")
    public Optional<PharmacyDTO> getPharmacyById(@PathVariable Long id) {
        return pharmacyService.findPharmacyById(id).map(PharmacyMapper :: toDTO);
    }
    @PostMapping("/addPharmacy")
    public PharmacyDTO createPharmacy(@RequestBody PharmacyDTO pharmacyDTO) {;
        return PharmacyMapper.toDTO( pharmacyService.save(pharmacyDTO));
    }

    @DeleteMapping("/{id}")
    public void  deletePharmacy(@PathVariable Long id) {
       pharmacyService.deletePharmacyById(id);
    }

    
    
}
