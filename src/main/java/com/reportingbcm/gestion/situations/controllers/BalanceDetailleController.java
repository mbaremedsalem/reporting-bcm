package com.reportingbcm.gestion.situations.controllers;


import com.reportingbcm.gestion.situations.dto.BalanceDetailleDto;
import com.reportingbcm.gestion.situations.service.BalanceDetailleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class BalanceDetailleController {


    private final BalanceDetailleService balanceDetailleService;

    /**
     * Endpoint pour recuperate tout les StatBCM_BalanceDetaillee
     *
     * @return
     */
    @GetMapping("/etatBCM/EtatBCM_BalanceDetaillee")
    public ResponseEntity<?> getAllBalanceDetaillee() {
        List<BalanceDetailleDto> balanceDetailleDtos = balanceDetailleService.findAll();
        if (balanceDetailleDtos.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(balanceDetailleDtos);
    }


}
