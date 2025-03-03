package fr.wayUp.cleanArchitecture_demo.application.usecase.pharmacy;

import fr.wayUp.cleanArchitecture_demo.domain.model.Pharmacy;
import fr.wayUp.cleanArchitecture_demo.domain.repository.PharmacyRepository;
import fr.wayUp.cleanArchitecture_demo.web.DTO.PharmacyDTO;

public class SavePharmacyUseCase {
    private final PharmacyRepository pharmacyRepository;

    public SavePharmacyUseCase(PharmacyRepository pharmacyRepository) {
        this.pharmacyRepository = pharmacyRepository;
    }
    public Pharmacy create(PharmacyDTO pharmacyDTO){
           return  this.pharmacyRepository.save(pharmacyDTO);
    }
}
