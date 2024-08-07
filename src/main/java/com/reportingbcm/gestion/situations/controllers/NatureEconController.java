package com.reportingbcm.gestion.situations.controllers;


import com.reportingbcm.gestion.situations.domain.NatEconomique;
import com.reportingbcm.gestion.situations.service.NatEconService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class NatureEconController {


    private final NatEconService natEconService;

    /**
     * Endpoint pour recuperate les natureEconomique
     *
     * @param
     * @return
     */
    @GetMapping("/naturesEconomiques")
    public ResponseEntity<?> GetNatureEconomiques() {
        List<NatEconomique> natEconomiqueList = natEconService.getNatEconomique();
        if (natEconomiqueList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(natEconomiqueList);
    }


}
