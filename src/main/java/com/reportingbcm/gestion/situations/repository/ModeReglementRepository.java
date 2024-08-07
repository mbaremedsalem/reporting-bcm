package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.ModeReglment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModeReglementRepository extends JpaRepository<ModeReglment, String> {


}
