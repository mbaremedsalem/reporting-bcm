package com.reportingbcm.gestion.situations.mappers;


import com.reportingbcm.gestion.situations.domain.ReleveComptesCorrespondant;
import com.reportingbcm.gestion.situations.dto.ReleveCompteCorrespondantDto;
import org.springframework.util.StringUtils;

public class ReleveCompteCorrespondantMapper {
    public static ReleveCompteCorrespondantDto toReleveCompteCorrespondantDto(final ReleveComptesCorrespondant r) {
        ReleveCompteCorrespondantDto releveCompteCorrespondantDto = ReleveCompteCorrespondantDto.builder()
                .nomCorrespondant(StringUtils.hasText(r.getNomCorrespondant()) ? r.getNomCorrespondant().trim() : r.getNomCorrespondant())
                .devise(r.getDevise())
                .banque(StringUtils.hasText(r.getBanque()) ? r.getBanque().trim() : r.getBanque())
                .soldeDebutJournee(r.getSoldeDebutJournee())
                .soldeFinJournee(r.getSoldeFinJournee())
                .totalMvtsCrediteurs(r.getTotalMvtsCrediteurs())
                .totalMvtsDebiteursJournee(r.getTotalMvtsDebiteursJournee())
                .numCompte(StringUtils.hasText(r.getNumCompte()) ? r.getNumCompte().trim() : r.getNumCompte())
                .build();

        return releveCompteCorrespondantDto;
    }

}
