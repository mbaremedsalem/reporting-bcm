package com.reportingbcm.gestion.situations.controllers;


import com.reportingbcm.gestion.situations.domain.Pays;
import com.reportingbcm.gestion.situations.service.PaysService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PaysController {


    private final PaysService paysService;

    /**
     * Endpoint pour recuperate les pays
     *
     * @param
     * @return
     */
    @GetMapping("/pays")
    public ResponseEntity<?> GetPays() {
        List<Pays> paysList = paysService.getPays();
        if (paysList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(paysList);
    }


}
