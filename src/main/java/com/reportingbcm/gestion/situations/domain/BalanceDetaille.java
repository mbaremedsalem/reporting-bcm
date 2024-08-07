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
@Table(name = "balance_detaille")
public class BalanceDetaille {
    @Id
    private String id;
    private String banque;
    private Date dateClotureBalance;
    private String compte;
    private String intituleCompteComptable;
    private String compteBancaireClient;
    private String intituleCompteBancaire;
    private String estClientApparente;
    private String resident;
    private String devise;
    private String activiteClient;
    private String secteurActiviteClient;
    private BigDecimal soldeDebiteur;
    private BigDecimal soldeCrediteur;
    private BigDecimal soldeMru;
    @CreationTimestamp
    private LocalDateTime createdAt;
    @UpdateTimestamp
    private LocalDateTime updatedAt;

}
