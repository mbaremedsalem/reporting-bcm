package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.BalanceGenerale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceGeneraleRepository extends JpaRepository<BalanceGenerale, String> {

}
