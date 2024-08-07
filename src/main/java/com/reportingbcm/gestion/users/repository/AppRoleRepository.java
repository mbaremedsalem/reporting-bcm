package com.reportingbcm.gestion.users.repository;


import com.reportingbcm.gestion.users.entities.AppRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AppRoleRepository extends JpaRepository<AppRole, Long> {

    Optional<AppRole> findByRoleName(String rolename);

}
