package com.reportingbcm.gestion.situations.service;


import com.reportingbcm.gestion.situations.domain.FluxSortants;
import com.reportingbcm.gestion.situations.dto.FluxSortrantDto;
import com.reportingbcm.gestion.situations.dto.RequestFluxSortrantDto;
import com.reportingbcm.gestion.situations.mappers.FluxSortantsMapper;
import com.reportingbcm.gestion.situations.repository.FluxSortrantRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Slf4j
@RequiredArgsConstructor
public class FluxSortantservice {

    private final FluxSortrantRepository fluxSortrantRepository;


    public List<FluxSortrantDto> findAll() {

        List<FluxSortants> fluxSortrantDtos = fluxSortrantRepository.findAll();
        return fluxSortrantDtos.stream().map(FluxSortantsMapper::toFluxSortrantDto)
                .collect(Collectors.toList());
    }


    public void updateFluxSortants(String referenceTransaction, RequestFluxSortrantDto requestFluxSortrantDto) {
        Optional<FluxSortants> fluxSortants = Optional.ofNullable(fluxSortrantRepository.findFluxSortrantsByReferenceTransaction(referenceTransaction).get(0));
        fluxSortants.ifPresent(f -> {
            f.setPays(requestFluxSortrantDto.getPays());
            f.setNatureEconomique(requestFluxSortrantDto.getNatureEconomique());
            f.setSourceDevise(requestFluxSortrantDto.getSourceDevise());
            f.setProduit(requestFluxSortrantDto.getProduit());
            f.setModeReglement(requestFluxSortrantDto.getModeReglement());
            fluxSortrantRepository.save(f);
        });


    }
}
