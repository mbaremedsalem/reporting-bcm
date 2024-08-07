package com.reportingbcm.gestion.situations.controllers;


import com.reportingbcm.gestion.situations.domain.ModeReglment;
import com.reportingbcm.gestion.situations.service.ModeReglementService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ModeReglementController {


    private final ModeReglementService modeReglementService;

    /**
     * Endpoint pour recuperate les modeReglementServices
     *
     * @param
     * @return
     */
    @GetMapping("/modesReglements")
    public ResponseEntity<?> GetModeReglements() {
        List<ModeReglment> modeReglmentList = modeReglementService.getModeReglements();
        if (modeReglmentList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(modeReglmentList);
    }


}
