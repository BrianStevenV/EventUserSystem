package com.event.users.adapter.driving.handler;

import com.event.users.adapter.driving.dto.request.UserCreationRequestDto;

public interface IUserHandler {
    void createUser(UserCreationRequestDto userCreationRequestDto);
}
