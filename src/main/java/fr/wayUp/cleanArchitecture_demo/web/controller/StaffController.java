package fr.wayUp.cleanArchitecture_demo.web.controller;
import fr.wayUp.cleanArchitecture_demo.application.service.StaffService;
import fr.wayUp.cleanArchitecture_demo.domain.model.Staff;
import fr.wayUp.cleanArchitecture_demo.infrastructure.persistence.mapper.StaffMapper;
import fr.wayUp.cleanArchitecture_demo.web.DTO.StaffDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
 import org.springframework.web.bind.annotation.*;

 import java.util.List;
import java.util.Optional;

import static java.util.Objects.requireNonNull;

@RestController
@RequestMapping("/api/staff")
@RequiredArgsConstructor
public class StaffController {

    private final StaffService staffService;

    @GetMapping
    public List<StaffDTO> getAllStaff() {
        return StaffMapper.staffToDTO(staffService.getAllStaff());
    }

    @GetMapping("/{id}")
    public Optional<Staff> getStaffById(@PathVariable Long id) {
        return staffService.getStaffById(id);
    }

    @PostMapping("/addStaff")
    public StaffDTO createStaff(@RequestBody StaffDTO staffDTO) {
        System.out.println(staffDTO);
        return staffService.createStaff(staffDTO);
    }

    @DeleteMapping("/{id}")
    public void  deleteStaff(@PathVariable Long id) {
            staffService.deleteStaff(id);
    }

}
