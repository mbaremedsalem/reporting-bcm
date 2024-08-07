package com.reportingbcm.gestion.users.dto;

import lombok.*;

import java.util.Set;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private long id;
    private String username;
    private String password;
    private String fullname;
    private String email;
    private String intitulePoste;

    private Set<String> appRoles;

    private String metier;
}
