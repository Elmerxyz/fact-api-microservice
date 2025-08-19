package com.ejdev.companyservice.contexts.company.domain.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Company {
    private UUID companyId;
    private String ruc;
    private String bussinessName;
    private String taxAddress;
    private String phone;
    private String email;
    private String logoUrl;
    private String sunatUser;
    private String sunatPassword;
    private String certificateUrl;
    private String certificatePassword;
    private CompanyStatus status;
}
