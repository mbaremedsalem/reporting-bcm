package com.reportingbcm.gestion.users.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public class CreateUserRequest {

    private String username;
    private String email;
    private String password;
    private String fullname;
    private String intitulePoste;
    private Set<Integer> appRoles;
}
