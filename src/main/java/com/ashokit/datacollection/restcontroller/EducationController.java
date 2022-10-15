package com.ashokit.datacollection.restcontroller;

import com.ashokit.datacollection.bean.SaveResponse;
import com.ashokit.datacollection.entity.CitizenEducation;
import com.ashokit.datacollection.service.CitizenEducationService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/citizen/education")
public class CitizenEducationController {

    final CitizenEducationService educationService;

    @PostMapping("/")
    ResponseEntity<SaveResponse> saveEducationDetails(@RequestBody CitizenEducation education) {
        SaveResponse saveResponse = educationService.saveEducationDetail(education);
        return ResponseEntity.ok(saveResponse);
    }

    @GetMapping("/{id}")
    ResponseEntity<CitizenEducation> getEducationDetails(@PathVariable Long id) {
        return ResponseEntity.ok(educationService.getById(id));
    }

}
