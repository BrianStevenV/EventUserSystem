package com.event.users.domain.api;


import com.event.users.domain.model.User;

public interface IUserServicePort {
    void createUser(User user);
}
