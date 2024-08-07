package com.reportingbcm.gestion.situations.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReleveCompteCorrespondantDto {

    private String nomCorrespondant;
    private String banque;
    private String numCompte;
    private String devise;
    private BigDecimal soldeDebutJournee;
    private BigDecimal totalMvtsDebiteursJournee;
    private BigDecimal totalMvtsCrediteurs;
    private BigDecimal soldeFinJournee;

}
