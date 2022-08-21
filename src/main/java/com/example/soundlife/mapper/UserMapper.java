package com.example.soundlife.mapper;

import com.example.soundlife.dto.UserDto;
import com.example.soundlife.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface UserMapper {
    UserEntity convertToEntity(UserDto userDto);
    UserDto convertToDto(UserEntity userEntity);
}
