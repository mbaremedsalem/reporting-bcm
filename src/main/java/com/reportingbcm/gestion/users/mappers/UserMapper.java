package com.reportingbcm.gestion.users.mappers;


import com.reportingbcm.gestion.users.dto.CreateUserRequest;
import com.reportingbcm.gestion.users.dto.UserDto;
import com.reportingbcm.gestion.users.entities.AppRole;
import com.reportingbcm.gestion.users.entities.AppUser;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.stream.Collectors;

public class UserMapper {
    public static UserDto toUserDto(AppUser user) {

        UserDto userDto = UserDto
                .builder()
                .id(user.getId())
                .username(user.getUsername())
                .fullname(user.getFullname())
                .email(user.getEmail())
                .appRoles(user.getAppRoles().stream().map(AppRole::getRoleName).collect(Collectors.toSet()))
                .intitulePoste(user.getIntitulePoste())
                .build();


        return userDto;
    }

    public static AppUser toUser(final CreateUserRequest createUserRequest,
                                 final PasswordEncoder passwordEncoder) {

        AppUser user = AppUser.builder()
                .username(createUserRequest.getUsername())
                .email(createUserRequest.getEmail())
                .intitulePoste(createUserRequest.getIntitulePoste())
                .fullname(createUserRequest.getFullname())
                .password(passwordEncoder.encode(createUserRequest.getPassword()))
                .appRoles(createUserRequest.getAppRoles().stream().map(
                        id -> AppRole.builder().id(id).build()).collect(Collectors.toSet()))
                .build();

        return user;
    }

    public static AppUser updateUser(final CreateUserRequest createUserRequest,
                                     AppUser user) {
        user.setUsername(createUserRequest.getUsername());
        user.setEmail(createUserRequest.getEmail());
        user.setFullname(createUserRequest.getFullname());
        user.setIntitulePoste(createUserRequest.getIntitulePoste());
        user.setAppRoles(createUserRequest.getAppRoles().stream().map(
                id -> AppRole.builder().id(id).build()).collect(Collectors.toSet())
        );

        return user;

    }


}
