package com.tests.testGlobal.service;

import com.tests.testGlobal.dto.response.GenericResponse;
import org.springframework.http.ResponseEntity;

public interface TestInputService {

    ResponseEntity<GenericResponse> processDefaultUserInput(String message);

    ResponseEntity<GenericResponse> processCustomUserInput(String message);
}
