package com.reportingbcm.gestion.situations.service;


import com.reportingbcm.gestion.situations.domain.OuvertureCreditDocumentaire;
import com.reportingbcm.gestion.situations.dto.OuvertureCreditDocumDto;
import com.reportingbcm.gestion.situations.mappers.OuvertureCreditDocumMapper;
import com.reportingbcm.gestion.situations.repository.OuvertureCreditDocRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@Slf4j
@RequiredArgsConstructor
public class OuvertureCreditDocumService {

    private final OuvertureCreditDocRepository ouvertureCreditDocRepository;


    public List<OuvertureCreditDocumDto> findAll() {

        List<OuvertureCreditDocumentaire> ouvertureCreditDocumentaires = ouvertureCreditDocRepository.findAll();
        return ouvertureCreditDocumentaires.stream().map(OuvertureCreditDocumMapper::toOuvertureCreditDocumDto)
                .collect(Collectors.toList());
    }


}
