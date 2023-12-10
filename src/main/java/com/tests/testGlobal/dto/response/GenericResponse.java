package com.tests.testGlobal.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class GenericResponse {

    private String message;

    private String code;

    private LocalDateTime timeStamp;
}
