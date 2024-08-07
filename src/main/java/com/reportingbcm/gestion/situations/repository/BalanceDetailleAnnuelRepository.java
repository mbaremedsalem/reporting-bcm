package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.BalanceDetailleAnnuel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceDetailleAnnuelRepository extends JpaRepository<BalanceDetailleAnnuel, String> {


}
