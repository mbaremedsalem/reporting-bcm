package com.reportingbcm.gestion.users.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppRole {

    @Id
    @SequenceGenerator(name = "app_role_seq", sequenceName = "app_role_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "app_role_seq")
    private long id;
    private String roleName;
    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "appRoles")
    @ToString.Exclude
    private List<AppUser> userList;
}
