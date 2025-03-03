package fr.wayUp.cleanArchitecture_demo.application.usecase.staff;

import fr.wayUp.cleanArchitecture_demo.domain.repository.StaffRepository;

public class DeleteStaffUseCase {
    private final StaffRepository staffRepository;

    public DeleteStaffUseCase(StaffRepository staffRepository) {
        this.staffRepository = staffRepository;
    }
    public void excute(Long id){

        this.staffRepository.deleteStaffById(id);
    }
}
