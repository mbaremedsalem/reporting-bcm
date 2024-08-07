package com.reportingbcm.gestion.situations.controllers;


import com.reportingbcm.gestion.situations.dto.BalanceGeneraleAnnuelDto;
import com.reportingbcm.gestion.situations.service.BalanceGeneraleAnnuelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BalanceGeneraleAnnuelController {


    private final BalanceGeneraleAnnuelService balanceGeneraleAnnuelService;

    /**
     * Endpoint pour recuperer tout les EtatBCM_BalanceGenerale _Annuel
     *
     * @return
     */
    @GetMapping("/etatBCM/EtatBCM_BalanceGenerale_Annuel")
    // @Bulkhead(name="bulkheadApi")
    public ResponseEntity<?> getAllBCMBalanceGeneraleAnnuel() {
        List<BalanceGeneraleAnnuelDto> balanceGeneraleAnnuelDtoList = balanceGeneraleAnnuelService.findAll();
        if (balanceGeneraleAnnuelDtoList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(balanceGeneraleAnnuelDtoList);

    }


}
