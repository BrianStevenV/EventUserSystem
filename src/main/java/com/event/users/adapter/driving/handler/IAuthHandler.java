package com.event.users.adapter.driving.handler;

import com.event.users.adapter.driving.dto.request.LoginRequestDto;
import com.event.users.adapter.driving.dto.response.JwtResponseDto;

public interface IAuthHandler {
    JwtResponseDto login(LoginRequestDto loginRequestDto);
}
