package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, String> {


}
