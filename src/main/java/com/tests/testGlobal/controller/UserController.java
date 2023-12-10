package com.tests.testGlobal.controller;

import com.tests.testGlobal.dto.request.UserInputRequestDto;
import com.tests.testGlobal.dto.response.GenericResponse;
import com.tests.testGlobal.service.UserInputService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserInputService userInputService;

    @GetMapping("/input")
    public ResponseEntity<GenericResponse> processUserInput(@RequestBody UserInputRequestDto userInputRequestDto) {
        System.out.println(userInputRequestDto);
        System.out.println(userInputRequestDto.getInput());
        return userInputService.processUserInput(userInputRequestDto);
    }

    @GetMapping("/inputs")
    public ResponseEntity<GenericResponse> processUserInputs(@RequestBody @Valid UserInputRequestDto userInputRequestDto) {
        System.out.println(userInputRequestDto);
        System.out.println(userInputRequestDto.getInput());
        return userInputService.processUserInputs(userInputRequestDto);
    }
}
