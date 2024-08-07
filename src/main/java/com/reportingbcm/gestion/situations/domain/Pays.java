package com.reportingbcm.gestion.situations.domain;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "bcm_pays")
public class Pays {
    @Id
    private String code;
    private String pays;
    private String continent;


}
