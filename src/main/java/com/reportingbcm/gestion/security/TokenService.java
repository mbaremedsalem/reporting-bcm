package com.reportingbcm.gestion.security;

import com.reportingbcm.gestion.situations.proxies.BcmApiProxy;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Slf4j
@Service
@RequiredArgsConstructor
public class TokenService {
    private final BcmApiProxy bcmApiProxy;
    private String token;
    private final TokenConfig tokenConfig;

    public String login(LoginRequest tok) {

        log.info("recuperer ");

        ResponseEntity<String> tokenDto = bcmApiProxy.login(tok);
        String token = "Bearer " + tokenDto.getBody();
        log.info("token {}", tokenDto.getBody());

        return token;
    }

    private boolean hasTokenExpired() {
        if (Instant.now().isAfter(Instant.ofEpochSecond(60 * 60 * 1000))) {
            log.info("token expired");
            return true;
        } else {
            return false;
        }
    }


    public String getToken() {
        if (this.token == null || hasTokenExpired()) {
            this.token = login(tokenConfig);
        }

        log.info("get token {}", this.token);

        return this.token;
    }


}
