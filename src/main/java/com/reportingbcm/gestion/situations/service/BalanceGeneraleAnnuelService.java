package com.reportingbcm.gestion.situations.service;


import com.reportingbcm.gestion.situations.domain.BalanceGeneraleAnnuel;
import com.reportingbcm.gestion.situations.dto.BalanceGeneraleAnnuelDto;
import com.reportingbcm.gestion.situations.mappers.BalanceGeneraleAnnuelMapper;
import com.reportingbcm.gestion.situations.repository.BalanceGeneraleAnnuelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Slf4j
@RequiredArgsConstructor
public class BalanceGeneraleAnnuelService {

    private final BalanceGeneraleAnnuelRepository balanceGeneraleAnnuelRepository;


    public List<BalanceGeneraleAnnuelDto> findAll() {
        List<BalanceGeneraleAnnuel> balanceGeneraleAnnuels = balanceGeneraleAnnuelRepository.findAll();
        return balanceGeneraleAnnuels.stream().map(BalanceGeneraleAnnuelMapper::toBalanceGeneraleAnnuelDto)
                .collect(Collectors.toList());
    }


}
