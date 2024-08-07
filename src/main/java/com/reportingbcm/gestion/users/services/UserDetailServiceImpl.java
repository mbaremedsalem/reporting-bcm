package com.reportingbcm.gestion.users.services;


import com.reportingbcm.gestion.users.entities.AppUser;
import com.reportingbcm.gestion.users.entities.MyUserDetails;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserDetailServiceImpl implements UserDetailsService {

    private final AccountService accountService;

    @Override
    public MyUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AppUser appUser = accountService.loadAppUserByUsername(username);

        return MyUserDetails
                .builder()
                .id(appUser.getId())
                .username(appUser.getUsername())
                .password(appUser.getPassword())
                .fullname(appUser.getFullname())
                .email(appUser.getEmail())
                .authorities(appUser.getAppRoles().stream().map(r -> new SimpleGrantedAuthority(r.getRoleName())).collect(Collectors.toList()))
                .build();


    }
}
