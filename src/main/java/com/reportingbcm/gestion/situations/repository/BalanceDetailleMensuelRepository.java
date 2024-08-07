package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.BalanceDetailleMensuel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceDetailleMensuelRepository extends JpaRepository<BalanceDetailleMensuel, String> {

}
