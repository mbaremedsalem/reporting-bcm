package com.reportingbcm.gestion.users.repository;


import com.reportingbcm.gestion.users.entities.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface AppUserRepository extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByUsername(String username);


    @Modifying
    @Query("update AppUser u set u.password = :password where u.password is null")
    void updatepassword(String password);

    List<AppUser> findByAppRolesRoleName(String roleName);
}
