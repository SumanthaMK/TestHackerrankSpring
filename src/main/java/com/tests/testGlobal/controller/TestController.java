package com.tests.testGlobal.controller;

import com.tests.testGlobal.dto.request.UserInputRequestDto;
import com.tests.testGlobal.dto.response.GenericResponse;
import com.tests.testGlobal.service.TestInputService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v2/")
@RequiredArgsConstructor
public class TestController {

    private final TestInputService testInputService;

    @GetMapping("/defaultHello")
    public ResponseEntity<GenericResponse> processDefaultHello(@RequestParam(required = false) String message) {
        return testInputService.processDefaultUserInput(message);
    }

    @PostMapping("/customHello")
    public ResponseEntity<GenericResponse> processCustomUserInput(@RequestParam String message) {
        return testInputService.processCustomUserInput(message);
    }

}
