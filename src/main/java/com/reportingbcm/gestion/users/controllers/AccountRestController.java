package com.reportingbcm.gestion.users.controllers;

import com.reportingbcm.gestion.users.dto.ChangePwdRequest;
import com.reportingbcm.gestion.users.dto.CreateUserRequest;
import com.reportingbcm.gestion.users.dto.RoleUserFormDto;
import com.reportingbcm.gestion.users.dto.UserDto;
import com.reportingbcm.gestion.users.entities.AppRole;
import com.reportingbcm.gestion.users.entities.AppUser;
import com.reportingbcm.gestion.users.services.AccountService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class AccountRestController {

    private final AccountService accountService;

    @GetMapping("/users")
    public List<UserDto> appUsers() {
        return accountService.listUsers();

    }


    @PostMapping("/users")
    public ResponseEntity<?> createUser(@RequestBody CreateUserRequest createUserRequest) {
        AppUser user = accountService.createUser(createUserRequest);

        return ResponseEntity.ok().build();
    }


    @GetMapping("/user/{id}")
    public UserDto getUserById(@PathVariable long id) {
        return accountService.getUserById(id);
    }

    @GetMapping("/user/Username/{username}")
    public ResponseEntity<?> getUserByUsername(@PathVariable String username) {
        UserDto userDto = accountService.loadUserByUsername(username);
        if (userDto == null) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(userDto);

    }


    @PostMapping("/roles")
    public AppRole saveRole(@RequestBody AppRole appRole) {
        return accountService.addNewRole(appRole);
    }


    @GetMapping("/roles")
    public ResponseEntity<?> appRoles() {
        List<AppRole> roles = accountService.listRoles();
        return ResponseEntity.ok(roles);

    }

    @PostMapping("/addRoleToUser")
    public void addRoleToUser(@RequestBody RoleUserFormDto roleUserFormDto) {
        accountService.addRoleToUser(roleUserFormDto.getUsername(), roleUserFormDto.getRoleName());
    }


    @GetMapping("/users/{rolename}")
    public ResponseEntity<?> getUserByRole(@PathVariable String rolename) {
        List<UserDto> urs = accountService.loadUserByRole(rolename);
        if (urs.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(urs);
    }

    @PostMapping("/user/change-pwd/{id}")
    public ResponseEntity<?> changePassword(@RequestBody ChangePwdRequest changePwdRequest, @PathVariable long id) {
        accountService.changePwd(changePwdRequest, id);
        return ResponseEntity.ok().build();
    }

    @PostMapping("user/{id}")
    public ResponseEntity<?> updateUser(@RequestBody CreateUserRequest createUserRequest,
                                        @PathVariable long id) {
        accountService.updateUser(createUserRequest, id);

        return ResponseEntity.ok().build();

    }


}
