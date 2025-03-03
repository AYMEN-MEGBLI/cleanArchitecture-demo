package fr.wayUp.cleanArchitecture_demo.application.usecase.pharmacy;

import fr.wayUp.cleanArchitecture_demo.domain.model.Pharmacy;
import fr.wayUp.cleanArchitecture_demo.domain.repository.PharmacyRepository;

import java.util.List;

public class GetListPharmaciesUseCase {
    private final PharmacyRepository pharmacyRepository;

    public GetListPharmaciesUseCase(PharmacyRepository pharmacyRepository) {
        this.pharmacyRepository = pharmacyRepository;
    }
    public List<Pharmacy> execute(){
        return this.pharmacyRepository.findAllPharmacies();
    }
}
