package com.tests.testGlobal.service;

import com.tests.testGlobal.dto.request.UserInputRequestDto;
import com.tests.testGlobal.dto.response.GenericResponse;
import com.tests.testGlobal.exception.InputException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.time.LocalDateTime;
import java.util.Objects;

import static com.tests.testGlobal.constant.UserConstant.*;

@Service
public class UserInputServiceImpl implements UserInputService {

    @Override
    public ResponseEntity<GenericResponse> processUserInput(UserInputRequestDto userInputRequestDto) {
        String result = DEFAULT_OUTPUT_MESSAGE + (Objects.isNull(userInputRequestDto.getInput()) ? "":
                userInputRequestDto.getInput());
        return new ResponseEntity<>(GenericResponse.builder().
                message(result)
                .code(DEFAULT_SUCCESS_CODE)
                .timeStamp(LocalDateTime.now())
                .build(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<GenericResponse> processUserInputs(UserInputRequestDto userInputRequestDto) {
        if(!StringUtils.hasLength(userInputRequestDto.getInput())) {
            throw new InputException(INPUT_EMPTY_MESSAGE);
        }
        String result = DEFAULT_OUTPUT_MESSAGE + userInputRequestDto.getInput();
        return new ResponseEntity<>(GenericResponse.builder().
                message(result)
                .code(DEFAULT_SUCCESS_CODE)
                .timeStamp(LocalDateTime.now())
                .build(), HttpStatus.OK);
    }
}
