package com.reportingbcm.gestion.situations.mappers;


import com.reportingbcm.gestion.situations.domain.PrevisionEcheance;
import com.reportingbcm.gestion.situations.dto.PrevisionEchDto;
import org.springframework.util.StringUtils;

public class PrevisionEchMapper {
    public static PrevisionEchDto toPrevisionEchDto(final PrevisionEcheance b) {
        PrevisionEchDto previsionEchDto = PrevisionEchDto.builder()
                .dateEcheance(b.getDateEcheance())
                .banque(StringUtils.hasText(b.getBanque()) ? b.getBanque().trim() : b.getBanque())
                .montantEcheance(b.getMontantEcheance())
                .devise(b.getDevise())
                .numCredoc(StringUtils.hasText(b.getNumCredoc()) ? b.getNumCredoc().trim() : b.getNumCredoc())
                .build();

        return previsionEchDto;
    }

}
