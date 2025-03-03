package fr.wayUp.cleanArchitecture_demo.application.service;
import fr.wayUp.cleanArchitecture_demo.application.usecase.staff.DeleteStaffUseCase;
import fr.wayUp.cleanArchitecture_demo.application.usecase.staff.GetListStaffUseCase;
import fr.wayUp.cleanArchitecture_demo.application.usecase.staff.GetStaffUseCase;
import fr.wayUp.cleanArchitecture_demo.application.usecase.staff.SaveSatffUseCase;
import fr.wayUp.cleanArchitecture_demo.domain.model.Staff;
import fr.wayUp.cleanArchitecture_demo.web.DTO.StaffDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffService {



    private final    GetListStaffUseCase getListStaffUseCase ;
    private final       GetStaffUseCase getStaffUseCase;
    private final    SaveSatffUseCase saveSatffUseCase;
    private  final DeleteStaffUseCase deleteStaffUseCase;




    public StaffService(
            GetListStaffUseCase getListStaffUseCase,
            GetStaffUseCase getStaffUseCase,
            SaveSatffUseCase saveSatffUseCase,
            DeleteStaffUseCase deleteStaffUseCase){

                this.getListStaffUseCase=getListStaffUseCase;
                this.getStaffUseCase=getStaffUseCase;
                this.saveSatffUseCase=saveSatffUseCase ;
                this.deleteStaffUseCase = deleteStaffUseCase;
    }
    public List<Staff> getAllStaff() {
        return this.getListStaffUseCase.execute();
    }
    public Optional<Staff> getStaffById(Long id) {
        return this.getStaffUseCase.execute(id);
    }
    public StaffDTO createStaff(StaffDTO staffDTO) {
        return this.saveSatffUseCase.execute(staffDTO);
    }

    public void deleteStaff(Long id) {
        this.deleteStaffUseCase.excute(id);
    }

    
}