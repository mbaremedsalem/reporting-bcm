package com.reportingbcm.gestion.situations.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BalanceDetailleAnnuelDto {
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
}
