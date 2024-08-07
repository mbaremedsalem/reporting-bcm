package com.reportingbcm.gestion.situations.repository;


import com.reportingbcm.gestion.situations.domain.PublierHis;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublierHisRepository extends JpaRepository<PublierHis, Long> {


}
