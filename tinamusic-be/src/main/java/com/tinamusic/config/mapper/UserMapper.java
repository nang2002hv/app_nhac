package com.tinamusic.config.mapper;

import com.tinamusic.mapper.BaseMapstruct;
import com.tinamusic.model.dto.request.UserRequest;
import com.tinamusic.model.dto.response.UserDto;
import com.tinamusic.model.entity.UserModel;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface UserMapper extends BaseMapstruct<UserRequest, UserModel, UserDto> {

}
