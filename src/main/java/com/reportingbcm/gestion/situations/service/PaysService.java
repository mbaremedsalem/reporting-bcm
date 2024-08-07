package com.reportingbcm.gestion.situations.service;


import com.reportingbcm.gestion.situations.domain.Pays;
import com.reportingbcm.gestion.situations.repository.PaysRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
@RequiredArgsConstructor
public class PaysService {

    private final PaysRepository paysRepository;


    public List<Pays> getPays() {
        List<Pays> pays = paysRepository.findAll();
        return pays;
    }


}
