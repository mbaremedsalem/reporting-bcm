package com.reportingbcm.gestion.users.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ChangePwdRequest {


    private String currentPassword;
    private String newPassword;
    private String confirmPassword;

}
