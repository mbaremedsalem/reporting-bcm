package com.reportingbcm.gestion.situations.service;


import com.reportingbcm.gestion.situations.domain.BalanceDetailleAnnuel;
import com.reportingbcm.gestion.situations.dto.BalanceDetailleAnnuelDto;
import com.reportingbcm.gestion.situations.mappers.BalanceDetailleAnnuelMapper;
import com.reportingbcm.gestion.situations.repository.BalanceDetailleAnnuelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Slf4j
@RequiredArgsConstructor
public class BalanceDetailleAnnuelService {

    private final BalanceDetailleAnnuelRepository balanceDetailleAnnuelRepository;

    public List<BalanceDetailleAnnuelDto> findAll() {

        List<BalanceDetailleAnnuel> balanceDetailleAnnuels = balanceDetailleAnnuelRepository.findAll();
        return balanceDetailleAnnuels.stream().map(BalanceDetailleAnnuelMapper::toBalanceDetailleAnnuelDto)
                .collect(Collectors.toList());
    }

}
