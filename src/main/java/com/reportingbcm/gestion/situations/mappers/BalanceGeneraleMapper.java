package com.reportingbcm.gestion.situations.mappers;


import com.reportingbcm.gestion.situations.domain.BalanceGenerale;
import com.reportingbcm.gestion.situations.dto.BalanceGeneraleDto;
import org.springframework.util.StringUtils;

public class BalanceGeneraleMapper {
    public static BalanceGeneraleDto toBalanceGeneraleDto(final BalanceGenerale b) {

        BalanceGeneraleDto balanceGeneraleDto = BalanceGeneraleDto.builder()
                .dateClotureBalance(b.getDateClotureBalance())
                .compte(StringUtils.hasText(b.getCompte()) ? b.getCompte().trim() : b.getCompte())
                .banque(StringUtils.hasText(b.getBanque()) ? b.getBanque().trim() : b.getBanque())
                .intituleCompte(StringUtils.hasText(b.getIntituleCompte()) ? b.getIntituleCompte().trim() : b.getIntituleCompte())
                .devise(StringUtils.hasText(b.getDevise()) ? b.getDevise().trim() : b.getDevise())
                .soldeDebiteur(b.getSoldeDebiteur())
                .soldeCrediteur(b.getSoldeCrediteur())
                .build();
        return balanceGeneraleDto;
    }


}
