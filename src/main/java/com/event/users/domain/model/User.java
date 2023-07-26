package com.event.users.domain.model;

import com.event.users.adapter.driving.dto.request.GenderRequestDto;

public class User {
    private Integer dniNumber;
    private String name;
    private String surName;
    private Integer age;
    private GenderRequestDto gender;
    private String email;
    private String password;

    public User(Integer dniNumber, String name, String surName, Integer age, GenderRequestDto gender, String email, String password) {
        this.dniNumber = dniNumber;
        this.name = name;
        this.surName = surName;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
    }
    public User(){}
}
