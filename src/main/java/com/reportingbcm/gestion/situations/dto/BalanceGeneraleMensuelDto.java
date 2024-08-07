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
public class BalanceGeneraleMensuelDto {
    private String banque;
    private Date dateClotureBalance;
    private String compte;
    private String intituleCompte;
    private String devise;
    private BigDecimal soldeDebiteur;
    private BigDecimal soldeCrediteur;


}
