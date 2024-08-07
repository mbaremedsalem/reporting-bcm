package com.reportingbcm.gestion.situations.controllers;


import com.reportingbcm.gestion.situations.dto.BalanceGeneraleDto;
import com.reportingbcm.gestion.situations.service.BalanceGeneraleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BalanceGeneraleController {


    private final BalanceGeneraleService balanceGeneraleService;

    /**
     * Endpoint pour recuperer tout les EtatBCM_BalanceGenerale
     *
     * @return
     */
    @GetMapping("/etatBCM/EtatBCM_BalanceGenerale")
    public ResponseEntity<?> getAllBCM_BalanceGenerale() {
        List<BalanceGeneraleDto> balanceGeneraleDtos = balanceGeneraleService.findAll();
        if (balanceGeneraleDtos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(balanceGeneraleDtos);
    }


}
