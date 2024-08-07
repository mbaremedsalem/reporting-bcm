package com.reportingbcm.gestion.situations.domain;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;


@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "ReleveComptesCorrespondants")
public class ReleveComptesCorrespondant {
    @Id
    @SequenceGenerator(name = "releve_cmpte_seq", sequenceName = "releve_cmpte_seq",
            allocationSize = 1)

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "releve_cmpte_seq")
    private long id;
    private String banque;
    private String nomCorrespondant;
    private String numCompte;
    private String devise;
    private BigDecimal soldeDebutJournee;
    private BigDecimal totalMvtsDebiteursJournee;
    private BigDecimal totalMvtsCrediteurs;
    private BigDecimal soldeFinJournee;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
