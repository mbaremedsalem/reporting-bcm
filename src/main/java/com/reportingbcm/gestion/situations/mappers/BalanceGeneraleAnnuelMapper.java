package com.reportingbcm.gestion.situations.mappers;


import com.reportingbcm.gestion.situations.domain.BalanceGeneraleAnnuel;
import com.reportingbcm.gestion.situations.dto.BalanceGeneraleAnnuelDto;
import org.springframework.util.StringUtils;

public class BalanceGeneraleAnnuelMapper {
    public static BalanceGeneraleAnnuelDto toBalanceGeneraleAnnuelDto(final BalanceGeneraleAnnuel b) {

        BalanceGeneraleAnnuelDto balanceGeneraleMensuelDto = BalanceGeneraleAnnuelDto.builder()
                .dateClotureBalance(b.getDateClotureBalance())
                .banque(StringUtils.hasText(b.getBanque()) ? b.getBanque().trim() : b.getBanque())
                .compte(StringUtils.hasText(b.getCompte()) ? b.getCompte().trim() : b.getCompte())
                .intituleCompte(StringUtils.hasText(b.getIntituleCompte()) ? b.getIntituleCompte().trim() : b.getIntituleCompte())
                .devise(StringUtils.hasText(b.getDevise()) ? b.getDevise().trim() : b.getDevise())
                .soldeDebiteur(b.getSoldeDebiteur())
                .soldeCrediteur(b.getSoldeCrediteur())
                .build();
        return balanceGeneraleMensuelDto;
    }


}
