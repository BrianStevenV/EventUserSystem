package com.event.users.adapter.driving.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserCreationRequestDto {
    private Integer dniNumber;
    private String name;
    private String surName;
    private Integer age;
    private GenderRequestDto gender;
    private String email;
    private String password;

}
