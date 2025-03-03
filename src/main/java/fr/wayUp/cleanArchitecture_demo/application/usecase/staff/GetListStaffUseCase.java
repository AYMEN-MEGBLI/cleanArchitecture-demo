package fr.wayUp.cleanArchitecture_demo.application.usecase.staff;

import fr.wayUp.cleanArchitecture_demo.domain.repository.StaffRepository;
import  fr.wayUp.cleanArchitecture_demo.domain.model.Staff;

import java.util.List;

public class GetListStaffUseCase {
    private final StaffRepository staffRepository;

    public GetListStaffUseCase(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public List<Staff> execute(){return staffRepository.findAllStaff();}

}
