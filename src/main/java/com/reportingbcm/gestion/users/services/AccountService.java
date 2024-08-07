package com.reportingbcm.gestion.users.services;


import com.reportingbcm.gestion.users.dto.ChangePwdRequest;
import com.reportingbcm.gestion.users.dto.CreateUserRequest;
import com.reportingbcm.gestion.users.dto.UserDto;
import com.reportingbcm.gestion.users.entities.AppRole;
import com.reportingbcm.gestion.users.entities.AppUser;
import com.reportingbcm.gestion.users.mappers.UserMapper;
import com.reportingbcm.gestion.users.repository.AppRoleRepository;
import com.reportingbcm.gestion.users.repository.AppUserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Slf4j
@Service
@Transactional
@RequiredArgsConstructor
public class AccountService {

    private final AppRoleRepository appRoleRepository;
    private final AppUserRepository appUserRepository;
    private final PasswordEncoder passwordEncoder;


    public AppRole addNewRole(AppRole appRole) {
        return appRoleRepository.save(appRole);
    }

    public void addRoleToUser(String username, String roleName) {
        appUserRepository
                .findByUsername(username)
                .flatMap(
                        appUser -> appRoleRepository
                                .findByRoleName(roleName)
                                .map(appRole -> appUser.getAppRoles().add(appRole)));
    }

    public UserDto loadUserByUsername(String username) {
        return appUserRepository.findByUsername(username).map(UserMapper::toUserDto).orElse(null);
    }


    public AppUser loadAppUserByUsername(String username) {
        return appUserRepository.findByUsername(username).orElseThrow();
    }


    public List<UserDto> listUsers() {
        return appUserRepository.findAll().stream().map(UserMapper::toUserDto).collect(Collectors.toList());
    }

    public List<AppRole> listRoles() {
        return appRoleRepository.findAll();
    }

    public List<UserDto> loadUserByRole(String rolename) {
        return appUserRepository.findByAppRolesRoleName(rolename).stream().map(UserMapper::toUserDto).collect(Collectors.toList());
    }


    public UserDto getUserById(long id) {
        return appUserRepository.findById(id).map(UserMapper::toUserDto).orElseThrow();
    }

    public void changePwd(ChangePwdRequest changePwdRequest, long id) {
        appUserRepository.findById(id).ifPresent(pw -> {
            pw.setPassword(passwordEncoder.encode(changePwdRequest.getNewPassword()));
            appUserRepository.save(pw);
        });

    }

    public AppUser createUser(CreateUserRequest createUserRequest) {
        AppUser user = UserMapper.toUser(createUserRequest, passwordEncoder);
        user = appUserRepository.save(user);
        return user;

    }

    public AppUser addNewUser(AppUser appUser) {
        String pw = appUser.getPassword();
        appUser.setPassword(passwordEncoder.encode(pw));
        return appUserRepository.save(appUser);
    }

    public void updateUser(CreateUserRequest createUserRequest, long id) {

        appUserRepository.findById(id).ifPresent(user -> {
            AppUser updateUser = UserMapper.updateUser(
                    createUserRequest, user);
            appUserRepository.save(updateUser);
        });


    }

    @Transactional
    public void init() {
        Optional<AppRole> admin = appRoleRepository.findByRoleName("ADMIN");
        if (admin.isEmpty()) {
            admin = Optional.of(addNewRole(AppRole.builder().roleName("ADMIN").build()));
        }


        Optional<AppUser> userAdmin = appUserRepository.findByUsername("admin");

        if (!userAdmin.isPresent()) {
            AppUser adminUser = addNewUser(
                    AppUser.builder()
                            .username("admin")
                            .password("123456")
                            .email("admin@test.mr")
                            .fullname("Admin account")
                            .build());

            adminUser.setAppRoles(List.of(admin.get()));


        }


    }


}
