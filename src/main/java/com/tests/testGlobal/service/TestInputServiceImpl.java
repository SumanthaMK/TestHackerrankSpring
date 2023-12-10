package com.tests.testGlobal.service;

import com.tests.testGlobal.dto.request.UserInputRequestDto;
import com.tests.testGlobal.dto.response.GenericResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;

import static com.tests.testGlobal.constant.UserConstant.*;

@Service
public class TestInputServiceImpl implements TestInputService {


    @Override
    public ResponseEntity<GenericResponse> processDefaultUserInput(String message) {
        String result;
        if (StringUtils.hasLength(message)) {
            result = DEFAULT_FINAL_MESSAGE + message;
        } else {
            result = DEFAULT_FINAL_MESSAGE_NOT_FOUND;
        }
        return new ResponseEntity<>(GenericResponse.builder().message(result).
                code(DEFAULT_SUCCESS_CODE).
                timeStamp(LocalDateTime.now()).build(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<GenericResponse> processCustomUserInput(String message) {
        String result;
        result = DEFAULT_FINAL_MESSAGE + message;
        return new ResponseEntity<>(GenericResponse.builder().message(result).
                code(DEFAULT_SUCCESS_CODE).
                timeStamp(LocalDateTime.now()).build(), HttpStatus.OK);
    }
}
