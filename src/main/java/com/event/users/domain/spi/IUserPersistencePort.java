package com.event.users.domain.spi;

import com.event.users.domain.model.User;

public interface IUserPersistencePort {
    void createUser(User user);
}
