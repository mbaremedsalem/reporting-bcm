package com.reportingbcm.gestion.situations.service;


import com.reportingbcm.gestion.situations.domain.ReleveComptesCorrespondant;
import com.reportingbcm.gestion.situations.dto.ReleveCompteCorrespondantDto;
import com.reportingbcm.gestion.situations.mappers.ReleveCompteCorrespondantMapper;
import com.reportingbcm.gestion.situations.repository.ReleveCompteCorrespondantRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class ReleveCompteCorrespondantService {

    private final ReleveCompteCorrespondantRepository releveCompteCorrespondantRepository;


    public List<ReleveCompteCorrespondantDto> findAll() {

        List<ReleveComptesCorrespondant> releveComptesCorrespondants = releveCompteCorrespondantRepository.findAll();
        return releveComptesCorrespondants.stream().map(r -> ReleveCompteCorrespondantMapper.toReleveCompteCorrespondantDto(r))
                .collect(Collectors.toList());
    }


}
