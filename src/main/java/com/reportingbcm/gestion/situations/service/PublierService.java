package com.reportingbcm.gestion.situations.service;


import com.reportingbcm.gestion.security.TokenService;
import com.reportingbcm.gestion.situations.domain.Publier;
import com.reportingbcm.gestion.situations.domain.PublierHis;
import com.reportingbcm.gestion.situations.dto.*;
import com.reportingbcm.gestion.situations.enums.StatusEnum;
import com.reportingbcm.gestion.situations.proxies.BcmApiProxy;
import com.reportingbcm.gestion.situations.repository.PublieBcmRepository;
import com.reportingbcm.gestion.situations.repository.PublierHisRepository;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
@Slf4j
@RequiredArgsConstructor
public class PublierService {

    private final PublieBcmRepository publieBcmRepository;
    private final PublierHisRepository publierHisRepository;
    private final BcmApiProxy bcmApiProxy;
    private final TokenService tokenService;
    private final BalanceGeneraleService balanceGeneraleService;
    private final BalanceDetailleService balanceDetailleService;
    private final FluxEntrantService fluxEntrantService;
    private final FluxSortantservice fluxSortantservice;
    private final OuvertureCreditDocumService ouvertureCreditDocumService;
    private final PrevisionEchService previsionEchService;
    private final ReleveCompteCorrespondantService releveCompteCorrespondantService;
    private final BalanceGeneraleMensuelService balanceGeneraleMensuelService;
    private final BalanceGeneraleAnnuelService balanceGeneraleAnnuelService;
    private final BalanceDetailleMensuelService balanceDetailleMensuelService;
    private final BalanceDetailleAnnuelService balanceDetailleAnnuelService;


    public Optional<Publier> findPublierByStatus(StatusEnum statusEnum) {
        Optional<Publier> publier = publieBcmRepository.findPublieByStatus(statusEnum);
        return publier;
    }

    public List<Publier> getPubliecation() {
        List<Publier> publiers = publieBcmRepository.findAll();
        return publiers;
    }


    public void publier(long pubId) {
        publieBcmRepository.findById(pubId).ifPresent(publier -> {
            try {
                if (publier.getSituation().equalsIgnoreCase("BalanceGenerale")) {
                    List<BalanceGeneraleDto> balanceGeneraleDtos = balanceGeneraleService.findAll();
                    String token = tokenService.getToken();
                    ResponseEntity<String> responseEntity = bcmApiProxy.sendBCMBalanceGenerale(token, balanceGeneraleDtos);
                    log.info("BalanceGenerale" + responseEntity.getBody());
                    updateStatut(publier, responseEntity);
                }
                if (publier.getSituation().equalsIgnoreCase("BalanceDetaillee")) {
                    List<BalanceDetailleDto> balanceGeneraleDtos = balanceDetailleService.findAll();
                    String token = tokenService.getToken();
                    ResponseEntity<?> responseEntity = bcmApiProxy.sendBCMBalanceDetaille(token, balanceGeneraleDtos);
                    updateStatut(publier, responseEntity);
                }
                if (publier.getSituation().equalsIgnoreCase("Flux_Entrants")) {
                    List<FluxEntrantDto> fluxEntrantDtos = fluxEntrantService.findAll();
                    String token = tokenService.getToken();
                    ResponseEntity<?> responseEntity = bcmApiProxy.sendBCMFluxEntrants(token, fluxEntrantDtos);
                    updateStatut(publier, responseEntity);
                }
                if (publier.getSituation().equalsIgnoreCase("Flux_Sortants")) {
                    List<FluxSortrantDto> fluxSortrantDtos = fluxSortantservice.findAll();
                    String token = tokenService.getToken();
                    ResponseEntity<?> responseEntity = bcmApiProxy.sendBCMFluxSortants(token, fluxSortrantDtos);
                    updateStatut(publier, responseEntity);
                }
                if (publier.getSituation().equalsIgnoreCase("OuvertureCreditDocumentaire")) {
                    List<OuvertureCreditDocumDto> ouvertureCreditDocumDtos = ouvertureCreditDocumService.findAll();
                    String token = tokenService.getToken();
                    ResponseEntity<?> responseEntity = bcmApiProxy.sendBCMOuvertureCreditDocumentaire(token, ouvertureCreditDocumDtos);
                    updateStatut(publier, responseEntity);
                }

                if (publier.getSituation().equalsIgnoreCase("PrevisionEcheance")) {
                    List<PrevisionEchDto> previsionEchDtos = previsionEchService.findAll();
                    String token = tokenService.getToken();
                    ResponseEntity<?> responseEntity = bcmApiProxy.sendBCMPrevisionEcheance(token, previsionEchDtos);
                    updateStatut(publier, responseEntity);
                }
                if (publier.getSituation().equalsIgnoreCase("ReleveDesComptesCorrespondants")) {
                    List<ReleveCompteCorrespondantDto> releveCompteCorrespondantDtos = releveCompteCorrespondantService.findAll();
                    String token = tokenService.getToken();
                    ResponseEntity<?> responseEntity = bcmApiProxy.sendBCMReleveDesComptesCorrespondants(token, releveCompteCorrespondantDtos);
                    updateStatut(publier, responseEntity);
                }

                if (publier.getSituation().equalsIgnoreCase("BalanceGenerale_Mensuel")) {
                    List<BalanceGeneraleMensuelDto> balanceGeneraleMensuelDtos = balanceGeneraleMensuelService.findAll();
                    String token = tokenService.getToken();
                    ResponseEntity<?> responseEntity = bcmApiProxy.sendBCMBalanceGeneraleMensuel(token, balanceGeneraleMensuelDtos);
                    updateStatut(publier, responseEntity);
                }
                if (publier.getSituation().equalsIgnoreCase("BalanceGenerale_Annuel")) {
                    List<BalanceGeneraleAnnuelDto> balanceGeneraleAnnuelDtos = balanceGeneraleAnnuelService.findAll();
                    String token = tokenService.getToken();
                    ResponseEntity<?> responseEntity = bcmApiProxy.sendBCMBalanceGeneraleAnnuel(token, balanceGeneraleAnnuelDtos);
                    updateStatut(publier, responseEntity);
                }

                if (publier.getSituation().equalsIgnoreCase("BalanceDetaillee_Mensuel")) {
                    List<BalanceDetailleMensuelDto> balanceDetailleMensuelDtos = balanceDetailleMensuelService.findAll();
                    String token = tokenService.getToken();
                    ResponseEntity<?> responseEntity = bcmApiProxy.sendBCMBalanceDetailleMensuel(token, balanceDetailleMensuelDtos);
                    updateStatut(publier, responseEntity);
                }

                if (publier.getSituation().equalsIgnoreCase("BalanceDetaillee_Annuel")) {
                    List<BalanceDetailleAnnuelDto> balanceDetailleAnnuelDtos = balanceDetailleAnnuelService.findAll();
                    String token = tokenService.getToken();
                    ResponseEntity<?> responseEntity = bcmApiProxy.sendBCMBalanceDetailleAnnuel(token, balanceDetailleAnnuelDtos);
                    updateStatut(publier, responseEntity);
                }

            } catch (FeignException feignException) {
                publier.setStatus(StatusEnum.ERROR);
                publieBcmRepository.save(publier);
                PublierHis publierHis = PublierHis.builder()
                        .datePublication(publier.getUpdatedAt())
                        .status(publier.getStatus().name())
                        .situation(publier.getSituation())
                        .build();
                publierHisRepository.save(publierHis);
            }

        });


    }

    public void updateStatut(Publier publier, ResponseEntity<?> responseEntity) {
        if (responseEntity.getStatusCode() == HttpStatus.OK) {
            publier.setStatus(StatusEnum.PUBLIER);
            publieBcmRepository.save(publier);
            PublierHis publierHis = PublierHis.builder()
                    .datePublication(publier.getUpdatedAt())
                    .status(publier.getStatus().name())
                    .situation(publier.getSituation())
                    .build();
            publierHisRepository.save(publierHis);
        }
    }
}
