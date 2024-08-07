package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.FluxEntrants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FluxEntrantRepository extends JpaRepository<FluxEntrants, String> {

    @Query(value = "SELECT f from FluxEntrants f WHERE trim(f.referenceTransaction) = ?1")
    List<FluxEntrants> findFluxEntrantsByReferenceTransaction(String referenceTransaction);


}
