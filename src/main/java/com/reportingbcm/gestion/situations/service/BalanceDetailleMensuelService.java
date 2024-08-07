package com.reportingbcm.gestion.situations.service;


import com.reportingbcm.gestion.situations.domain.BalanceDetailleMensuel;
import com.reportingbcm.gestion.situations.dto.BalanceDetailleMensuelDto;
import com.reportingbcm.gestion.situations.mappers.BalanceDetailleMensuelMapper;
import com.reportingbcm.gestion.situations.repository.BalanceDetailleMensuelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Slf4j
@RequiredArgsConstructor
public class BalanceDetailleMensuelService {

    private final BalanceDetailleMensuelRepository balanceDetailleMensuelRepository;

    public List<BalanceDetailleMensuelDto> findAll() {

        List<BalanceDetailleMensuel> balanceDetailleMensuelles = balanceDetailleMensuelRepository.findAll();
        return balanceDetailleMensuelles.stream().map(BalanceDetailleMensuelMapper::toBalanceDetailleDto)
                .collect(Collectors.toList());
    }


}
