package com.tests.testGlobal.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Data
@RequiredArgsConstructor
public class UserInputRequestDto {

    private String input;
}
