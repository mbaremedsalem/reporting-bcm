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
@Table(name = "bcm_modereglement")
public class ModeReglment {
    @Id
    private String libelle;
    private String modeReglement;


}
