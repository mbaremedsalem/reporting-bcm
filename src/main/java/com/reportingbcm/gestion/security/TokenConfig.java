package com.reportingbcm.gestion.security;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("token")
@Getter
@Setter
public class TokenConfig extends LoginRequest {

}
