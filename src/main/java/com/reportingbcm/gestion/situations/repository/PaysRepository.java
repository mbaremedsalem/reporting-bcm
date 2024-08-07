package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.Pays;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaysRepository extends JpaRepository<Pays, String> {


}
