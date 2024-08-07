package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.BalanceGeneraleMensuel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BalanceGeneraleMensuelRepository extends JpaRepository<BalanceGeneraleMensuel, String> {


}
