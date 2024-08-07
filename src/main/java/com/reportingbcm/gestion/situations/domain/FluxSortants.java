package com.reportingbcm.gestion.situations.domain;


import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "flux_sortants")
public class FluxSortants {
    @Id
    private String referenceTransaction;
    private String banque;
    private Date dateTransaction;
    private String typeSwfit;
    private String modeReglement;
    private String devise;
    private String sourceDevise;
    private String nomDonneurOrdre;
    private String nifNni;
    private String beneficiaire;
    private String produit;
    private String natureEconomique;
    private String pays;
    private BigDecimal montantTransaction;
    private BigDecimal tauxDeChange;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
