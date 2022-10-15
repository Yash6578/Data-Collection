package com.ashokit.datacollection.restcontroller;

import com.ashokit.datacollection.bean.SaveResponse;
import com.ashokit.datacollection.entity.CitizenChildren;
import com.ashokit.datacollection.service.CitizenChildrenService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/citizen/children")
@AllArgsConstructor
public class CitizenIncomeController {

    final CitizenChildrenService childrenService;

    @PostMapping("/")
    ResponseEntity<SaveResponse> saveChildrenDetails(@RequestBody CitizenChildren children) {
        System.out.println(children);
        var saveResponse = childrenService.saveChildrenDetail(children);
        return ResponseEntity.ok(saveResponse);
    }

    /**
     * For testing purpose
     */
    @GetMapping("/{id}")
    ResponseEntity<CitizenChildren> getById(@PathVariable Long id) {
        return ResponseEntity.ok(childrenService.getById(id));
    }
}
