package com.reportingbcm.gestion.situations.service;


import com.reportingbcm.gestion.situations.domain.FluxEntrants;
import com.reportingbcm.gestion.situations.dto.FluxEntrantDto;
import com.reportingbcm.gestion.situations.dto.RequestFluxEntrantDto;
import com.reportingbcm.gestion.situations.mappers.FluxEntrantMapper;
import com.reportingbcm.gestion.situations.repository.FluxEntrantRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Slf4j
@RequiredArgsConstructor
public class FluxEntrantService {

    private final FluxEntrantRepository fluxEntrantRepository;


    public List<FluxEntrantDto> findAll() {

        List<FluxEntrants> fluxEntrants = fluxEntrantRepository.findAll();
        return fluxEntrants.stream().map(FluxEntrantMapper::toFluxEntrantsDto)
                .collect(Collectors.toList());
    }


    public void updateFluxEntrants(String referenceTransaction, RequestFluxEntrantDto requestFluxEntrantDto) {
        Optional<FluxEntrants> fluxEntrants = Optional.ofNullable(fluxEntrantRepository.findFluxEntrantsByReferenceTransaction(referenceTransaction).get(0));
        fluxEntrants.ifPresent(f -> {
            f.setPays(requestFluxEntrantDto.getPays());
            f.setNatureEconomique(requestFluxEntrantDto.getNatureEconomique());
            f.setProduit(requestFluxEntrantDto.getProduit());
            f.setModeReglement(requestFluxEntrantDto.getModeReglement());
            fluxEntrantRepository.save(f);
        });


    }
}
