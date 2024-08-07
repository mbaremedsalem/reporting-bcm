package com.reportingbcm.gestion.situations.controllers;


import com.reportingbcm.gestion.situations.dto.BalanceGeneraleMensuelDto;
import com.reportingbcm.gestion.situations.service.BalanceGeneraleMensuelService;
import com.reportingbcm.gestion.situations.service.PublierService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BalanceGeneraleMensuelController {


    private final BalanceGeneraleMensuelService balanceGeneraleMensuelService;
    private final PublierService publierService;

    /**
     * Endpoint pour recuperer tout les EtatBCM_BalanceGenerale _Mensuel
     *
     * @return
     */
    @GetMapping("/etatBCM/EtatBCM_BalanceGenerale_Mensuel")
    public ResponseEntity<?> getAllBCM_BalanceGenerale() {
        List<BalanceGeneraleMensuelDto> balanceGeneraleMensuelDtos = balanceGeneraleMensuelService.findAll();
        if (balanceGeneraleMensuelDtos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(balanceGeneraleMensuelDtos);

    }


}
