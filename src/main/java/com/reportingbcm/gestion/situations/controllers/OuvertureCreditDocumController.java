package com.reportingbcm.gestion.situations.controllers;


import com.reportingbcm.gestion.situations.dto.OuvertureCreditDocumDto;
import com.reportingbcm.gestion.situations.service.OuvertureCreditDocumService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class OuvertureCreditDocumController {


    private final OuvertureCreditDocumService ouvertureCreditDocumService;

    /**
     * Endpoint pour recuperer tout les EtatBCM_OuvertureCreditDocumentaire
     *
     * @return
     */
    @GetMapping("/etatBCM/EtatBCM_OuvertureCreditDocumentaire")
    public ResponseEntity<?> getAllEtatBCM_OuvertureCreditDocumentaire() {
        List<OuvertureCreditDocumDto> ouvertureCreditDocumDtos = ouvertureCreditDocumService.findAll();
        if (ouvertureCreditDocumDtos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(ouvertureCreditDocumDtos);
    }


}
