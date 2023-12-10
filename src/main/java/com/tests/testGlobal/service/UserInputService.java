package com.tests.testGlobal.service;

import com.tests.testGlobal.dto.request.UserInputRequestDto;
import com.tests.testGlobal.dto.response.GenericResponse;
import org.springframework.http.ResponseEntity;

public interface UserInputService {

    ResponseEntity<GenericResponse> processUserInput(UserInputRequestDto userInputRequestDto);

    ResponseEntity<GenericResponse> processUserInputs(UserInputRequestDto userInputRequestDto);
}
