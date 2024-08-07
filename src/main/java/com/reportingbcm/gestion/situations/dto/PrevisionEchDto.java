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
public class PrevisionEchDto {

    private String numCredoc;
    private String banque;
    private Date dateEcheance;
    private String devise;
    private BigDecimal montantEcheance;

}
