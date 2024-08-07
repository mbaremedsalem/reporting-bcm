package com.reportingbcm.gestion.situations.mappers;


import com.reportingbcm.gestion.situations.domain.OuvertureCreditDocumentaire;
import com.reportingbcm.gestion.situations.dto.OuvertureCreditDocumDto;
import org.springframework.util.StringUtils;

public class OuvertureCreditDocumMapper {
    public static OuvertureCreditDocumDto toOuvertureCreditDocumDto(final OuvertureCreditDocumentaire o) {
        OuvertureCreditDocumDto ouvertureCreditDocumDto = OuvertureCreditDocumDto.builder()
                .numCredoc(StringUtils.hasText(o.getNumCredoc()) ? o.getNumCredoc().trim() : o.getNumCredoc())
                .dateOuverture(o.getDateOuverture())
                .banque(StringUtils.hasText(o.getBanque()) ? o.getBanque().trim() : o.getBanque())
                .nomDonneurOrdre(StringUtils.hasText(o.getNomDonneurOrdre()) ? o.getNomDonneurOrdre().trim() : o.getNomDonneurOrdre())
                .devise(o.getDevise())
                .beneficiaire(StringUtils.hasText(o.getBeneficiaire()) ? o.getBeneficiaire().trim() : o.getBeneficiaire())
                .nomCorrespondant(StringUtils.hasText(o.getNomCorrespondant()) ? o.getNomCorrespondant().trim() : o.getNomCorrespondant())
                .produit(StringUtils.hasText(o.getProduit()) ? o.getProduit().trim() : o.getProduit())
                .pays(StringUtils.hasText(o.getPays()) ? o.getPays().trim() : o.getPays())
                .montantOuverture(o.getMontantOuverture())
                .deposite(o.getDeposite())
                .build();

        return ouvertureCreditDocumDto;
    }

}
