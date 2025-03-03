package fr.wayUp.cleanArchitecture_demo;

import fr.wayUp.cleanArchitecture_demo.application.service.StaffService;
import fr.wayUp.cleanArchitecture_demo.application.usecase.staff.DeleteStaffUseCase;
import fr.wayUp.cleanArchitecture_demo.application.usecase.staff.GetListStaffUseCase;
import fr.wayUp.cleanArchitecture_demo.application.usecase.staff.GetStaffUseCase;
import fr.wayUp.cleanArchitecture_demo.application.usecase.staff.SaveSatffUseCase;
import fr.wayUp.cleanArchitecture_demo.domain.repository.StaffRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Bean
    public StaffService StaffService(
                                      SaveSatffUseCase saveStaffUseCase,
                                      GetListStaffUseCase getListStaffsUseCase,
                                      GetStaffUseCase getStaffUseCase,
                                      DeleteStaffUseCase deleteStaffUseCase){
    return new StaffService(getListStaffsUseCase,getStaffUseCase,saveStaffUseCase,  deleteStaffUseCase);
    }
    @Bean
    public   SaveSatffUseCase saveStaffUseCase(StaffRepository staffJpaRepository){
        return new   SaveSatffUseCase(staffJpaRepository);
    }

    @Bean
    public GetListStaffUseCase getListStaffsUseCase(StaffRepository staffJpaRepository){
        return new GetListStaffUseCase(staffJpaRepository);
    }

    @Bean
    public GetStaffUseCase getStaffUseCase(StaffRepository StaffJpaRepository){
        return new GetStaffUseCase(StaffJpaRepository);
    }
    @Bean
    public DeleteStaffUseCase deleteStaffUseCase(StaffRepository StaffJpaRepository){
        return new DeleteStaffUseCase(StaffJpaRepository);
    }

}
