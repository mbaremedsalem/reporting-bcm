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
public class OuvertureCreditDocumDto {

    private String numCredoc;
    private String banque;
    private Date dateOuverture;
    private String nomDonneurOrdre;
    private String devise;
    private String beneficiaire;
    private String nomCorrespondant;
    private String produit;
    private String pays;
    private BigDecimal montantOuverture;
    private BigDecimal deposite;

}
