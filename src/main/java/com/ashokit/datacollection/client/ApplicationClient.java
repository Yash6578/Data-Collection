package com.ashokit.datacollection.client;

import com.ashokit.datacollection.bean.ApplicationRegistration;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ApplicationRegistration", url = "http://localhost:8081")
public interface ApplicationRegistrationClient {
    @GetMapping("/application/{applicationId}")
    ResponseEntity<ApplicationRegistration> getApplication(@PathVariable Long applicationId);
}
