package com.event.users.adapter.driving.handler.imp;

import com.event.users.adapter.driving.dto.request.UserCreationRequestDto;
import com.event.users.adapter.driving.handler.IUserHandler;
import com.event.users.adapter.driving.mapper.IUserRequestMapper;
import com.event.users.domain.api.IUserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserHandlerImp implements IUserHandler {
    private IUserServicePort userServicePort;
    private IUserRequestMapper userRequestMapper;
    @Override
    public void createUser(UserCreationRequestDto userCreationRequestDto) {
        userServicePort.createUser(userRequestMapper.toUser(userCreationRequestDto));
    }
}
