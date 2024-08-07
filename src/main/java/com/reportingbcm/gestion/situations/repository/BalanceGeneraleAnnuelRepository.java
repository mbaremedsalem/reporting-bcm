package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.BalanceGeneraleAnnuel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceGeneraleAnnuelRepository extends JpaRepository<BalanceGeneraleAnnuel, String> {


}
