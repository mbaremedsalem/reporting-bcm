package com.reportingbcm.gestion.situations.controllers;


import com.reportingbcm.gestion.situations.domain.Produit;
import com.reportingbcm.gestion.situations.service.ProduitService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ProduitController {


    private final ProduitService produitService;

    /**
     * Endpoint pour recuperate les produits
     *
     * @param
     * @return
     */
    @GetMapping("/produits")
    public ResponseEntity<?> GetProduits() {
        List<Produit> produitList = produitService.getProduit();
        if (produitList.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(produitList);
    }


}
