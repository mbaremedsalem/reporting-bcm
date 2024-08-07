package com.reportingbcm.gestion.situations.service;


import com.reportingbcm.gestion.situations.domain.BalanceGenerale;
import com.reportingbcm.gestion.situations.dto.BalanceGeneraleDto;
import com.reportingbcm.gestion.situations.mappers.BalanceGeneraleMapper;
import com.reportingbcm.gestion.situations.repository.BalanceGeneraleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Slf4j
@RequiredArgsConstructor
public class BalanceGeneraleService {

    private final BalanceGeneraleRepository balanceGeneraleRepository;


    public List<BalanceGeneraleDto> findAll() {

        List<BalanceGenerale> balanceGenerales = balanceGeneraleRepository.findAll();
        return balanceGenerales.stream().map(BalanceGeneraleMapper::toBalanceGeneraleDto)
                .collect(Collectors.toList());
    }


}
