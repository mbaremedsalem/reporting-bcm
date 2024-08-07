package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.PrevisionEcheance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrevisionEcheRepository extends JpaRepository<PrevisionEcheance, String> {


}
