package com.reportingbcm.gestion.situations.controllers;


import com.reportingbcm.gestion.situations.domain.Publier;
import com.reportingbcm.gestion.situations.service.PublierService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@CrossOrigin("*")
@RestController
@RequiredArgsConstructor

public class PublierController {


    private final PublierService publierService;

    /**
     * Endpoint pour recuperate les EtatBCM a publier
     *
     * @param
     * @return
     */
    @GetMapping("etatBCM/publier")
    public ResponseEntity<?> GetPulication() {
        List<Publier> publierList = publierService.getPubliecation();
        if (publierList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(publierList);
    }

    /**
     * Endpoint pour PUBLIER les EtatBCM
     *
     * @param id
     * @return
     */
    @PutMapping("etatBCM/publier/{id}")
    public ResponseEntity<?> publier(@PathVariable long id) {
        publierService.publier(id);
        return ResponseEntity.ok().build();
    }


}
