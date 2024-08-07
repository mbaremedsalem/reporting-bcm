package com.reportingbcm.gestion.situations.service;


import com.reportingbcm.gestion.situations.domain.ModeReglment;
import com.reportingbcm.gestion.situations.repository.ModeReglementRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@Slf4j
@RequiredArgsConstructor
public class ModeReglementService {

    private final ModeReglementRepository modeReglementRepository;


    public List<ModeReglment> getModeReglements() {
        List<ModeReglment> modeReglments = modeReglementRepository.findAll();
        return modeReglments;
    }


}
