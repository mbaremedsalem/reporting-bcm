package com.reportingbcm.gestion.situations.controllers;


import com.reportingbcm.gestion.situations.dto.FluxSortrantDto;
import com.reportingbcm.gestion.situations.dto.RequestFluxSortrantDto;
import com.reportingbcm.gestion.situations.service.FluxSortantservice;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class FluxSortrantController {


    private final FluxSortantservice fluxSortantservice;

    /**
     * Endpoint pour recuperer tout les EtatBCM_Flux_Sortants
     *
     * @return
     */
    @GetMapping("/etatBCM/EtatBCM_Flux_Sortants")
    public ResponseEntity<?> getAllEtatBCM_Flux_Sortants() {
        List<FluxSortrantDto> fluxSortrantDtos = fluxSortantservice.findAll();
        if (fluxSortrantDtos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(fluxSortrantDtos);
    }


    /**
     * Endpoint pour modifier les pays et natureEcon
     *
     * @param referenceTransaction,requestFluxEntrantDto
     * @return
     */
    @PostMapping("updateFluxSortants/{referenceTransaction}")
    public ResponseEntity<?> updateFluxSortants(@PathVariable String referenceTransaction, @RequestBody RequestFluxSortrantDto requestFluxSortrantDto) {
        fluxSortantservice.updateFluxSortants(referenceTransaction, requestFluxSortrantDto);
        return ResponseEntity.ok().build();
    }
}
