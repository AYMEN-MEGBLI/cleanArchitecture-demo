package fr.wayUp.cleanArchitecture_demo;

import fr.wayUp.cleanArchitecture_demo.application.service.PharmacyService;
import fr.wayUp.cleanArchitecture_demo.application.usecase.pharmacy.DeletePharmacyUseCase;
import fr.wayUp.cleanArchitecture_demo.application.usecase.pharmacy.GetListPharmaciesUseCase;
import fr.wayUp.cleanArchitecture_demo.application.usecase.pharmacy.GetPharmacyUseCase;
import fr.wayUp.cleanArchitecture_demo.application.usecase.pharmacy.SavePharmacyUseCase;
import fr.wayUp.cleanArchitecture_demo.domain.repository.PharmacyRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PharmacyConfig {
    @Bean
    public PharmacyService pharmacyService(DeletePharmacyUseCase deletePharmacyUseCase, SavePharmacyUseCase savePharmacyUseCase, GetPharmacyUseCase getPharmacyUseCase, GetListPharmaciesUseCase getListPharmaciesUseCase){
        return   new PharmacyService(deletePharmacyUseCase,savePharmacyUseCase, getPharmacyUseCase, getListPharmaciesUseCase);
    }
    @Bean
    public DeletePharmacyUseCase deletePharmacyUseCase(PharmacyRepository pharmacyRepository){
       return  new DeletePharmacyUseCase(pharmacyRepository) ;
    }
    @Bean
    public SavePharmacyUseCase savePharmacyUseCase(PharmacyRepository pharmacyRepository){
        return  new SavePharmacyUseCase(pharmacyRepository) ;
    }
    @Bean
    public GetPharmacyUseCase getPharmacyUseCase(PharmacyRepository pharmacyRepository){
        return  new GetPharmacyUseCase(pharmacyRepository) ;
    }
    @Bean
    public GetListPharmaciesUseCase getListPharmaciesUseCase(PharmacyRepository pharmacyRepository){
        return  new GetListPharmaciesUseCase(pharmacyRepository) ;
    }
}
