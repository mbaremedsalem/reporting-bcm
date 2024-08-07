package com.reportingbcm.gestion.situations.service;


import com.reportingbcm.gestion.situations.domain.BalanceGeneraleMensuel;
import com.reportingbcm.gestion.situations.dto.BalanceGeneraleMensuelDto;
import com.reportingbcm.gestion.situations.mappers.BalanceGeneraleMensuelMapper;
import com.reportingbcm.gestion.situations.repository.BalanceGeneraleMensuelRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Slf4j
@RequiredArgsConstructor
public class BalanceGeneraleMensuelService {

    private final BalanceGeneraleMensuelRepository balanceGeneraleMensuelRepository;


    public List<BalanceGeneraleMensuelDto> findAll() {
        List<BalanceGeneraleMensuel> balanceGeneraleMensuels = balanceGeneraleMensuelRepository.findAll();
        return balanceGeneraleMensuels.stream().map(BalanceGeneraleMensuelMapper::toBalanceGeneraleMensuelDto)
                .collect(Collectors.toList());
    }


}
