package com.reportingbcm.gestion.situations.mappers;


import com.reportingbcm.gestion.situations.domain.FluxSortants;
import com.reportingbcm.gestion.situations.dto.FluxSortrantDto;
import org.springframework.util.StringUtils;

public class FluxSortantsMapper {
    public static FluxSortrantDto toFluxSortrantDto(final FluxSortants f) {
        FluxSortrantDto fluxSortrantDto = FluxSortrantDto.builder()
                .referenceTransaction(StringUtils.hasText(f.getReferenceTransaction()) ? f.getReferenceTransaction().trim() : f.getReferenceTransaction())
                .dateTransaction(f.getDateTransaction())
                .banque(StringUtils.hasText(f.getBanque()) ? f.getBanque().trim() : f.getBanque())
                .typeSwfit(StringUtils.hasText(f.getTypeSwfit()) ? f.getTypeSwfit().trim() : f.getTypeSwfit())
                .modeReglement(StringUtils.hasText(f.getModeReglement()) ? f.getModeReglement().trim() : f.getModeReglement())
                .sourceDevise(StringUtils.hasText(f.getSourceDevise()) ? f.getSourceDevise().trim() : f.getSourceDevise())
                .devise(StringUtils.hasText(f.getDevise()) ? f.getDevise().trim() : f.getDevise())
                .nomDonneurOrdre(StringUtils.hasText(f.getNomDonneurOrdre()) ? f.getNomDonneurOrdre().trim() : f.getNomDonneurOrdre())
                .nifNni(StringUtils.hasText(f.getNifNni()) ? f.getNifNni().trim() : f.getNifNni())
                .beneficiaire(StringUtils.hasText(f.getBeneficiaire()) ? f.getBeneficiaire().trim() : f.getBeneficiaire())
                .produit(StringUtils.hasText(f.getProduit()) ? f.getProduit().trim() : f.getProduit())
                .natureEconomique(StringUtils.hasText(f.getNatureEconomique()) ? f.getNatureEconomique().trim() : f.getNatureEconomique())
                .pays(StringUtils.hasText(f.getPays()) ? f.getPays().trim() : f.getPays())
                .montantTransaction(f.getMontantTransaction())
                .tauxDeChange(f.getTauxDeChange())
                .build();

        return fluxSortrantDto;
    }

}
