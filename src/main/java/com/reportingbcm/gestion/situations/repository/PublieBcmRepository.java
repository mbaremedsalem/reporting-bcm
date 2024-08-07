package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.Publier;
import com.reportingbcm.gestion.situations.enums.StatusEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PublieBcmRepository extends JpaRepository<Publier, Long> {
    Optional<Publier> findPublieByStatus(StatusEnum statusEnum);


}
