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
@Table(name = "ouverturecreditdocumentaire")
public class OuvertureCreditDocumentaire {
    @Id
    private String numCredoc;
    private Date dateOuverture;
    private String nomDonneurOrdre;
    private String devise;
    private String beneficiaire;
    private String nomCorrespondant;
    private String produit;
    private String pays;
    private BigDecimal montantOuverture;
    private BigDecimal deposite;
    private String banque;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
