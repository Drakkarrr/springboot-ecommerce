package com.store.store.mappers;

import com.store.store.dtos.UserDto;
import com.store.store.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}
