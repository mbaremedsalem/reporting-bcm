package com.reportingbcm.gestion.situations.mappers;


import com.reportingbcm.gestion.situations.domain.BalanceGeneraleMensuel;
import com.reportingbcm.gestion.situations.dto.BalanceGeneraleMensuelDto;
import org.springframework.util.StringUtils;

public class BalanceGeneraleMensuelMapper {
    public static BalanceGeneraleMensuelDto toBalanceGeneraleMensuelDto(final BalanceGeneraleMensuel b) {

        BalanceGeneraleMensuelDto balanceGeneraleMensuelDto = BalanceGeneraleMensuelDto.builder()
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
