package fr.wayUp.cleanArchitecture_demo.application.usecase.pharmacy;

import fr.wayUp.cleanArchitecture_demo.domain.model.Pharmacy;
import fr.wayUp.cleanArchitecture_demo.domain.repository.PharmacyRepository;

import java.util.Optional;

public class GetPharmacyUseCase {
    private final PharmacyRepository pharmacyRepository;

    public GetPharmacyUseCase(PharmacyRepository pharmacyRepository) {
        this.pharmacyRepository = pharmacyRepository;
    }
   public Optional<Pharmacy> find(Long id){
        return this.pharmacyRepository.findPharmacyById(id);
   }
}
