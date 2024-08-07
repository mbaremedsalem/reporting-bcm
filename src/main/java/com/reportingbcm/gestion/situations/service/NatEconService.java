package com.reportingbcm.gestion.situations.service;


import com.reportingbcm.gestion.situations.domain.NatEconomique;
import com.reportingbcm.gestion.situations.repository.NatEconRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
@RequiredArgsConstructor
public class NatEconService {

    private final NatEconRepository natEconRepository;


    public List<NatEconomique> getNatEconomique() {
        List<NatEconomique> natEconomiqueList = natEconRepository.findAll();
        return natEconomiqueList;
    }


}
