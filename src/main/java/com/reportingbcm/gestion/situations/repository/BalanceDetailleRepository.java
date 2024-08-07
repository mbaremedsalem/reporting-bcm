package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.BalanceDetaille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceDetailleRepository extends JpaRepository<BalanceDetaille, String> {

}
