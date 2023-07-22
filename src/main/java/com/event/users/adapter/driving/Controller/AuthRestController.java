package com.event.users.adapter.driving.Controller;

import com.event.users.adapter.driving.dto.request.LoginRequestDto;
import com.event.users.adapter.driving.handler.IAuthHandler;
import com.event.users.adapter.driving.dto.response.JwtResponseDto;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthRestController {

    private final IAuthHandler authHandler;

    @PostMapping
    public ResponseEntity<JwtResponseDto> login(@Valid @RequestBody LoginRequestDto loginRequestDto){
        return new ResponseEntity<>(authHandler.login(loginRequestDto), HttpStatus.OK);
    }
}
