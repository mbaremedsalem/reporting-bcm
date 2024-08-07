package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.FluxSortants;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FluxSortrantRepository extends JpaRepository<FluxSortants, String> {

    @Query(value = "SELECT f from FluxSortants f WHERE trim(f.referenceTransaction) = ?1")
    List<FluxSortants> findFluxSortrantsByReferenceTransaction(String referenceTransaction);


}
