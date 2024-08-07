package com.reportingbcm.gestion.situations.proxies;


import com.reportingbcm.gestion.security.LoginRequest;
import com.reportingbcm.gestion.situations.dto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.List;

/**
 * Client vers l'API de BCM
 */
@FeignClient(name = "api-bcm", url = "${bcm_api_url}")
public interface BcmApiProxy {


    @PostMapping("/authenticate/login")
    ResponseEntity<String> login(@RequestBody LoginRequest loginRequest);

    @PostMapping("/etatBCM/EtatBCM_BalanceGenerale")
    ResponseEntity<String> sendBCMBalanceGenerale(@RequestHeader("Authorization") String token, @RequestBody List<BalanceGeneraleDto> balanceGeneraleDtos);

    @PostMapping("/etatBCM/EtatBCM_BalanceGenerale_Mensuel")
    ResponseEntity<String> sendBCMBalanceGeneraleMensuel(@RequestHeader("Authorization") String token, @RequestBody List<BalanceGeneraleMensuelDto> balanceGeneraleMensuelDtos);

    @PostMapping("/etatBCM/EtatBCM_BalanceGenerale_Annuel")
    ResponseEntity<String> sendBCMBalanceGeneraleAnnuel(@RequestHeader("Authorization") String token, @RequestBody List<BalanceGeneraleAnnuelDto> balanceGeneraleAnnuelDtos);

    @PostMapping("/etatBCM/EtatBCM_BalanceDetaillee")
    ResponseEntity<String> sendBCMBalanceDetaille(@RequestHeader("Authorization") String token, @RequestBody List<BalanceDetailleDto> balanceDetailleDtos);

    @PostMapping("/etatBCM/EtatBCM_BalanceDetaille_Mensuel")
    ResponseEntity<String> sendBCMBalanceDetailleMensuel(@RequestHeader("Authorization") String token, @RequestBody List<BalanceDetailleMensuelDto> balanceDetailleMensuelDtos);

    @PostMapping("/etatBCM/EtatBCM_BalanceDetaillee_Annuel")
    ResponseEntity<String> sendBCMBalanceDetailleAnnuel(@RequestHeader("Authorization") String token, @RequestBody List<BalanceDetailleAnnuelDto> balanceDetailleAnnuelDtos);

    @PostMapping("/etatBCM/EtatBCM_Flux_Sortants")
    ResponseEntity<String> sendBCMFluxSortants(@RequestHeader("Authorization") String token, @RequestBody List<FluxSortrantDto> fluxSortrantDtos);

    @PostMapping("/etatBCM/EtatBCM_Flux_Entrants")
    ResponseEntity<String> sendBCMFluxEntrants(@RequestHeader("Authorization") String token, @RequestBody List<FluxEntrantDto> fluxEntrantDtos);

    @PostMapping("/etatBCM/EtatBCM_OuvertureCreditDocumentaire")
    ResponseEntity<String> sendBCMOuvertureCreditDocumentaire(@RequestHeader("Authorization") String token, @RequestBody List<OuvertureCreditDocumDto> ouvertureCreditDocumDtos);

    @PostMapping("/etatBCM/EtatBCM_ReleveDesComptesCorrespondants")
    ResponseEntity<String> sendBCMReleveDesComptesCorrespondants(@RequestHeader("Authorization") String token, @RequestBody List<ReleveCompteCorrespondantDto> releveCompteCorrespondantDtos);

    @PostMapping("/etatBCM/EtatBCM_PrevisionEcheance")
    ResponseEntity<String> sendBCMPrevisionEcheance(@RequestHeader("Authorization") String token, @RequestBody List<PrevisionEchDto> previsionEchDtos);


}
