package com.reportingbcm.gestion.situations.mappers;


import com.reportingbcm.gestion.situations.domain.BalanceDetailleAnnuel;
import com.reportingbcm.gestion.situations.dto.BalanceDetailleAnnuelDto;
import org.springframework.util.StringUtils;

public class BalanceDetailleAnnuelMapper {
    public static BalanceDetailleAnnuelDto toBalanceDetailleAnnuelDto(final BalanceDetailleAnnuel b) {

        BalanceDetailleAnnuelDto balanceDetailleAnnuelDto = BalanceDetailleAnnuelDto.builder()
                .dateClotureBalance(b.getDateClotureBalance())
                .compte(StringUtils.hasText(b.getCompte()) ? b.getCompte().trim() : b.getCompte())
                .banque(StringUtils.hasText(b.getBanque()) ? b.getBanque().trim() : b.getBanque())
                .intituleCompteComptable(StringUtils.hasText(b.getIntituleCompteComptable()) ? b.getIntituleCompteComptable().trim() : b.getIntituleCompteComptable())
                .compteBancaireClient(StringUtils.hasText(b.getCompteBancaireClient()) ? b.getCompteBancaireClient().trim() : b.getCompteBancaireClient())
                .intituleCompteBancaire(StringUtils.hasText(b.getIntituleCompteBancaire()) ? b.getIntituleCompteBancaire().trim() : b.getIntituleCompteBancaire())
                .estClientApparente(StringUtils.hasText(b.getEstClientApparente()) ? b.getEstClientApparente().trim() : b.getEstClientApparente())
                .resident(b.getResident())
                .activiteClient(StringUtils.hasText(b.getActiviteClient()) ? b.getActiviteClient().trim() : b.getActiviteClient())
                .secteurActiviteClient(StringUtils.hasText(b.getSecteurActiviteClient()) ? b.getSecteurActiviteClient().trim() : b.getSecteurActiviteClient())
                .devise(b.getDevise())
                .soldeDebiteur(b.getSoldeDebiteur())
                .soldeCrediteur(b.getSoldeCrediteur())

                .build();

        return balanceDetailleAnnuelDto;
    }

}
