package fr.wayUp.cleanArchitecture_demo.application.usecase.pharmacy;

import fr.wayUp.cleanArchitecture_demo.domain.repository.PharmacyRepository;

public class DeletePharmacyUseCase {
    private final PharmacyRepository pharmacyRepository;

    public DeletePharmacyUseCase(PharmacyRepository pharmacyRepository) {
        this.pharmacyRepository = pharmacyRepository;
    }
    public void delete(Long id){
        pharmacyRepository.deletePharmacyById(id);
    }
}
