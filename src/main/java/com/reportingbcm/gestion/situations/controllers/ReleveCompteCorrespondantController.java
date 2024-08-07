package com.reportingbcm.gestion.situations.controllers;


import com.reportingbcm.gestion.situations.dto.ReleveCompteCorrespondantDto;
import com.reportingbcm.gestion.situations.service.ReleveCompteCorrespondantService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ReleveCompteCorrespondantController {


    private final ReleveCompteCorrespondantService releveCompteCorrespondantService;

    /**
     * Endpoint pour recuperer tout les EtatBCM_ReleveDesComptesCorrespondants
     *
     * @return
     */
    @GetMapping("/etatBCM/EtatBCM_ReleveDesComptesCorrespondants")
    public ResponseEntity<?> getAllEtatBCM_ReleveDesComptesCorrespondants() {
        List<ReleveCompteCorrespondantDto> releveCompteCorrespondantDtos = releveCompteCorrespondantService.findAll();
        if (releveCompteCorrespondantDtos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(releveCompteCorrespondantDtos);
    }


}
