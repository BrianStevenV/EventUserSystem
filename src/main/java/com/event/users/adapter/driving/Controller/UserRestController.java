package com.event.users.adapter.driving.Controller;

import com.event.users.adapter.driving.dto.request.UserCreationRequestDto;
import com.event.users.adapter.driving.handler.IUserHandler;
import com.event.users.configure.Constants;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
@RequestMapping("/user/")
@RequiredArgsConstructor
public class UserRestController {

    private final IUserHandler userHandler;

    @SecurityRequirement(name = "jwt")
    @PostMapping
    public ResponseEntity<Map<String, String>> createUser(@RequestBody UserCreationRequestDto userCreationRequestDto){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(Collections.singletonMap(Constants.RESPONSE_MESSAGE_KEY, Constants.RESPONSE_MESSAGE_USER_CREATED));
    }
}
