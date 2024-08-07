package com.reportingbcm.gestion.situations.service;


import com.reportingbcm.gestion.situations.domain.Produit;
import com.reportingbcm.gestion.situations.repository.ProduitRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
@RequiredArgsConstructor
public class ProduitService {

    private final ProduitRepository produitRepository;


    public List<Produit> getProduit() {
        List<Produit> produits = produitRepository.findAll();
        return produits;
    }


}
