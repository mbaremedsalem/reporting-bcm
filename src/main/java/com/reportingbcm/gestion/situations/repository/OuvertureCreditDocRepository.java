package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.OuvertureCreditDocumentaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OuvertureCreditDocRepository extends JpaRepository<OuvertureCreditDocumentaire, String> {


}
