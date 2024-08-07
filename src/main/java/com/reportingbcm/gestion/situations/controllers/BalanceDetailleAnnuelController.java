package com.reportingbcm.gestion.situations.controllers;


import com.reportingbcm.gestion.situations.dto.BalanceDetailleAnnuelDto;
import com.reportingbcm.gestion.situations.service.BalanceDetailleAnnuelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BalanceDetailleAnnuelController {


    private final BalanceDetailleAnnuelService balanceDetailleAnnuelService;

    /**
     * Endpoint pour recuperer tout les EtatBCM_BalanceDetaillee_Annuel
     *
     * @return
     */

    @GetMapping("/etatBCM/EtatBCM_BalanceDetaillee_Annuel")
    public ResponseEntity<?> getAllBCMBalanceDetailleAnnuel() {
        List<BalanceDetailleAnnuelDto> balanceDetailleAnnuelDtos = balanceDetailleAnnuelService.findAll();
        if (balanceDetailleAnnuelDtos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(balanceDetailleAnnuelDtos);

    }


}
