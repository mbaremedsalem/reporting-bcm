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
public class FluxEntrantDto {

    private String referenceTransaction;
    private String banque;
    private Date dateTransaction;
    private String typeSwfit;
    private String modeReglement;
    private String devise;
    private String nomDonneurOrdre;
    private String nifNni;
    private String beneficiaire;
    private String produit;
    private String natureEconomique;
    private String pays;
    private BigDecimal montantTransaction;
    private BigDecimal tauxDeChange;

}
