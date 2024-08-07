package com.reportingbcm.gestion.situations.controllers;


import com.reportingbcm.gestion.situations.dto.BalanceDetailleMensuelDto;
import com.reportingbcm.gestion.situations.service.BalanceDetailleMensuelService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BalanceDetailleMensuelController {


    private final BalanceDetailleMensuelService balanceDetailleMensuelService;


    /**
     * Endpoint pour recuperer tout les EtatBCM_BalanceDetaillee_Annuel
     *
     * @return
     */

    @GetMapping("/etatBCM/EtatBCM_BalanceDetaillee_Mensuel")
    public ResponseEntity<?> getAllBCMBalanceDetailleMensuel() {
        List<BalanceDetailleMensuelDto> balanceDetailleMensuelDtos = balanceDetailleMensuelService.findAll();
        if (balanceDetailleMensuelDtos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(balanceDetailleMensuelDtos);

    }


}
