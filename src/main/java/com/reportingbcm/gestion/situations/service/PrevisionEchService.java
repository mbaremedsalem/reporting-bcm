package com.reportingbcm.gestion.situations.service;


import com.reportingbcm.gestion.situations.domain.PrevisionEcheance;
import com.reportingbcm.gestion.situations.dto.PrevisionEchDto;
import com.reportingbcm.gestion.situations.mappers.PrevisionEchMapper;
import com.reportingbcm.gestion.situations.repository.PrevisionEcheRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Slf4j
@RequiredArgsConstructor
public class PrevisionEchService {

    private final PrevisionEcheRepository previsionEcheRepository;


    public List<PrevisionEchDto> findAll() {

        List<PrevisionEcheance> previsionEcheances = previsionEcheRepository.findAll();
        return previsionEcheances.stream().map(PrevisionEchMapper::toPrevisionEchDto)
                .collect(Collectors.toList());
    }


}
