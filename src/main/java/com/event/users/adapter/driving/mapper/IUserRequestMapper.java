package com.event.users.adapter.driving.mapper;

import com.event.users.adapter.driving.dto.request.UserCreationRequestDto;
import com.event.users.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IUserRequestMapper {
    User toUser(UserCreationRequestDto userCreationRequestDto);
}
