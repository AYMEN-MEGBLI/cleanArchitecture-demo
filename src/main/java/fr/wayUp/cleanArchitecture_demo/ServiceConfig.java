package fr.wayUp.cleanArchitecture_demo;

import fr.wayUp.cleanArchitecture_demo.application.service.ServiceService;
import fr.wayUp.cleanArchitecture_demo.application.usecase.service.DeleteServiceUseCase;
import fr.wayUp.cleanArchitecture_demo.application.usecase.service.GetListServicesUseCase;
import fr.wayUp.cleanArchitecture_demo.application.usecase.service.GetServiceUseCase;
import fr.wayUp.cleanArchitecture_demo.application.usecase.service.SaveServiceUseCase;
import fr.wayUp.cleanArchitecture_demo.domain.repository.ServiceRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public ServiceService ServiceService(GetServiceUseCase getServiceUseCase, GetListServicesUseCase getListServicesUseCase, DeleteServiceUseCase deleteServiceUseCase, SaveServiceUseCase saveServiceUseCase) {
       return new ServiceService(getServiceUseCase,getListServicesUseCase,deleteServiceUseCase,saveServiceUseCase);
    }
 @Bean
    public SaveServiceUseCase saveServiceUseCase(ServiceRepository serviceJpaRepository){
        return new   SaveServiceUseCase(serviceJpaRepository);
    }

    @Bean
    public GetListServicesUseCase getListServicesUseCase(ServiceRepository serviceJpaRepository){
        return new GetListServicesUseCase(serviceJpaRepository);
    }

    @Bean
    public GetServiceUseCase getServiceUseCase(ServiceRepository ServiceJpaRepository){
        return new GetServiceUseCase(ServiceJpaRepository);
    }
    @Bean
    public DeleteServiceUseCase deleteServiceUseCase(ServiceRepository ServiceJpaRepository){
        return new DeleteServiceUseCase(ServiceJpaRepository);
    }
    
}
