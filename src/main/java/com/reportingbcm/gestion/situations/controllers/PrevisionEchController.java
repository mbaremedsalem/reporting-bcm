package com.reportingbcm.gestion.situations.controllers;


import com.reportingbcm.gestion.situations.dto.PrevisionEchDto;
import com.reportingbcm.gestion.situations.service.PrevisionEchService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PrevisionEchController {


    private final PrevisionEchService previsionEchService;

    /**
     * Endpoint pour recuperer tout les EtatBCM_PrevisionEcheance
     *
     * @return
     */
    @GetMapping("/etatBCM/EtatBCM_PrevisionEcheance")
    public ResponseEntity<?> getAllEtatBCM_PrevisionEcheance() {
        List<PrevisionEchDto> previsionEchDtoList = previsionEchService.findAll();
        if (previsionEchDtoList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(previsionEchDtoList);
    }


}
