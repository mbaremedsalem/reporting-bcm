package com.reportingbcm.gestion.situations.service;


import com.reportingbcm.gestion.situations.domain.BalanceDetaille;
import com.reportingbcm.gestion.situations.dto.BalanceDetailleDto;
import com.reportingbcm.gestion.situations.mappers.BalanceDetailleMapper;
import com.reportingbcm.gestion.situations.repository.BalanceDetailleRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Slf4j
@RequiredArgsConstructor
public class BalanceDetailleService {

    private final BalanceDetailleRepository balanceDetailleRepository;


    public List<BalanceDetailleDto> findAll() {

        List<BalanceDetaille> balanceGenerales = balanceDetailleRepository.findAll();
        return balanceGenerales.stream().map(BalanceDetailleMapper::toBalanceDetailleDto)
                .collect(Collectors.toList());
    }


}
