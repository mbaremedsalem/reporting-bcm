package com.reportingbcm.gestion;

import com.reportingbcm.gestion.users.services.AccountService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableFeignClients
public class BcmGestionControleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BcmGestionControleApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AccountService accountService) {
        return args -> accountService.init();
    }

}
