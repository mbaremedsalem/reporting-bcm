package com.reportingbcm.gestion.situations.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestFluxSortrantDto {

    private String sourceDevise;
    private String natureEconomique;
    private String pays;
    private String produit;
    private String modeReglement;


}
