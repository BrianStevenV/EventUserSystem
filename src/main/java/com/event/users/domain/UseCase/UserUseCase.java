package com.event.users.domain.UseCase;

import com.event.users.domain.api.IUserServicePort;
import com.event.users.domain.model.User;
import com.event.users.domain.spi.IUserPersistencePort;

public class UserUseCase implements IUserServicePort {
    private final IUserPersistencePort userPersistencePort;

    public UserUseCase(IUserPersistencePort userPersistencePort) {
        this.userPersistencePort = userPersistencePort;
    }

    @Override
    public void createUser(User user) {
        userPersistencePort.createUser(user);
    }
}
