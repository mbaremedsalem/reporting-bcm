package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.ReleveComptesCorrespondant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReleveCompteCorrespondantRepository extends JpaRepository<ReleveComptesCorrespondant, Long> {


}
