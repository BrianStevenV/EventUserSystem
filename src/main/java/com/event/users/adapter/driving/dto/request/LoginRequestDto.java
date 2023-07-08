package com.event.users.adapter.driving.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class LoginRequestDto {
    @Email
    private String email;

    @NotBlank
    private String password;
}
