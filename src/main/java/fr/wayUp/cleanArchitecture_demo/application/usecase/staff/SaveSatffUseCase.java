package fr.wayUp.cleanArchitecture_demo.application.usecase.staff;

import fr.wayUp.cleanArchitecture_demo.domain.repository.StaffRepository;
import fr.wayUp.cleanArchitecture_demo.web.DTO.StaffDTO;

public class SaveSatffUseCase {

    private final StaffRepository staffRepository;


    public SaveSatffUseCase(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }

    public StaffDTO execute(StaffDTO staffDTO){
        return this.staffRepository.save(staffDTO);
    }
}
