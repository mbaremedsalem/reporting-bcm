package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.NatEconomique;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NatEconRepository extends JpaRepository<NatEconomique, String> {


}
