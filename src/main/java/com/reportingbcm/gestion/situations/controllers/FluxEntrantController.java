package com.reportingbcm.gestion.situations.controllers;


import com.reportingbcm.gestion.situations.dto.FluxEntrantDto;
import com.reportingbcm.gestion.situations.dto.RequestFluxEntrantDto;
import com.reportingbcm.gestion.situations.service.FluxEntrantService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class FluxEntrantController {


    private final FluxEntrantService fluxEntrantService;

    /**
     * Endpoint pour recuperer tout les EtatBCM_Flux_Entrants
     *
     * @return
     */
    @GetMapping("/etatBCM/EtatBCM_Flux_Entrants")
    public ResponseEntity<?> getAllEtatBCM_Flux_Entrants() {
        List<FluxEntrantDto> fluxEntrantDtoList = fluxEntrantService.findAll();
        if (fluxEntrantDtoList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(fluxEntrantDtoList);
    }


    /**
     * Endpoint pour modifier les pays et natureEcon
     *
     * @param referenceTransaction,requestFluxEntrantDto
     * @return
     */
    @PostMapping("updateFluxEntrant/{referenceTransaction}")
    public ResponseEntity<?> updateFluxEntrants(@PathVariable String referenceTransaction, @RequestBody RequestFluxEntrantDto requestFluxEntrantDto) {
        fluxEntrantService.updateFluxEntrants(referenceTransaction, requestFluxEntrantDto);
        return ResponseEntity.ok().build();
    }
}
