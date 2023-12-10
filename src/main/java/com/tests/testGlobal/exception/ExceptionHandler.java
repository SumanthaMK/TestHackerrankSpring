package com.tests.testGlobal.exception;

import com.tests.testGlobal.dto.response.GenericResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.time.LocalDateTime;

import static com.tests.testGlobal.constant.UserConstant.*;

@ControllerAdvice
public class ExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(RuntimeException.class)
    public ResponseEntity<GenericResponse> genericExceptionHandler(HttpServletRequest httpServletRequest,
                                                                   HttpServletResponse httpServletResponse,
                                                                   Exception e) {


        return new ResponseEntity<>(GenericResponse.builder().
                message(SOMETHING_WENT_WRONG)
                .code(SOMETHING_WENT_WRONG_CODE)
                .timeStamp(LocalDateTime.now())
                .build(), HttpStatus.INTERNAL_SERVER_ERROR);
    }

//    @org.springframework.web.bind.annotation.ExceptionHandler(HttpMessageNotReadableException.class)
//    public ResponseEntity<GenericResponse> HttpMessageNotReadableExceptionHandler(HttpServletRequest httpServletRequest,
//                                                                                  HttpServletResponse httpServletResponse,
//                                                                                  Exception e) {
//
//        return new ResponseEntity<>(GenericResponse.builder().
//                message(DEFAULT_OUTPUT_MESSAGE)
//                .code(DEFAULT_SUCCESS_CODE)
//                .timeStamp(LocalDateTime.now())
//                .build(), HttpStatus.OK);
//    }

    @org.springframework.web.bind.annotation.ExceptionHandler(InputException.class)
    public ResponseEntity<GenericResponse> InputExceptionHandler(HttpServletRequest httpServletRequest,
                                                                                  HttpServletResponse httpServletResponse,
                                                                                  Exception e) {

        return new ResponseEntity<>(GenericResponse.builder().
                message(INPUT_EMPTY_MESSAGE)
                .code(INPUT_EMPTY_CODE)
                .timeStamp(LocalDateTime.now())
                .build(), HttpStatus.BAD_REQUEST);
    }
}
