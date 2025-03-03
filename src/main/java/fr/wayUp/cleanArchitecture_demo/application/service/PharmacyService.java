package fr.wayUp.cleanArchitecture_demo.application.service;

import fr.wayUp.cleanArchitecture_demo.application.usecase.pharmacy.DeletePharmacyUseCase;
import fr.wayUp.cleanArchitecture_demo.application.usecase.pharmacy.GetListPharmaciesUseCase;
import fr.wayUp.cleanArchitecture_demo.application.usecase.pharmacy.GetPharmacyUseCase;
import fr.wayUp.cleanArchitecture_demo.application.usecase.pharmacy.SavePharmacyUseCase;
import fr.wayUp.cleanArchitecture_demo.domain.model.Pharmacy;
import fr.wayUp.cleanArchitecture_demo.web.DTO.PharmacyDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class PharmacyService {
     final DeletePharmacyUseCase deletePharmacyUseCase ;
     final SavePharmacyUseCase savePharmacyUseCase;
     final GetPharmacyUseCase getPharmacyUseCase;
     final GetListPharmaciesUseCase getListPharmaciesUseCase;

    public PharmacyService(DeletePharmacyUseCase deletePharmacyUseCase, SavePharmacyUseCase savePharmacyUseCase, GetPharmacyUseCase getPharmacyUseCase, GetListPharmaciesUseCase getListPharmaciesUseCase) {
        this.deletePharmacyUseCase = deletePharmacyUseCase;
        this.savePharmacyUseCase = savePharmacyUseCase;
        this.getPharmacyUseCase = getPharmacyUseCase;
        this.getListPharmaciesUseCase = getListPharmaciesUseCase;
    }

    public Pharmacy save(PharmacyDTO pharmacy){
        return this.savePharmacyUseCase.create(pharmacy);
    }

    public List<Pharmacy> findAllPharmacies (){
        return  this.getListPharmaciesUseCase.execute();
    }
   public  Optional<Pharmacy> findPharmacyById(Long id) {
        return this.getPharmacyUseCase.find(id);
   }
    public void  deletePharmacyById(Long id){
        this.deletePharmacyUseCase.delete(id);
    }

}
