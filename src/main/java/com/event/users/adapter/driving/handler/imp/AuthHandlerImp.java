package com.event.users.adapter.driving.handler.imp;

import com.event.users.adapter.driving.dto.request.LoginRequestDto;
import com.event.users.adapter.driving.dto.response.JwtResponseDto;
import com.event.users.adapter.driving.handler.IAuthHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthHandlerImp implements IAuthHandler {
    private final AuthenticationManager authenticationManager;
    private final JwtProvider jwtProvider;
    @Override
    public JwtResponseDto login(LoginRequestDto loginRequestDto) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequestDto.getEmail(), loginRequestDto.getPassword())
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateToken(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        String authorizationHeader = "Bearer " + jwt;
        System.out.println("Token generado: " + jwt);
        return new JwtResponseDto(jwt);
    }
}
