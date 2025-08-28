package com.ejdev.companyservice.contexts.company.application.CreateCompany;

import com.ejdev.companyservice.contexts.company.domain.model.CompanyStatus;
import lombok.Builder;

@Builder
public record CreateCompanyDto(
        String ruc,
        String bussinessName,
        String taxAddress,
        String phone,
        String email,
        String logoUrl,
        String sunatUser,
        String sunatPassword,
        String certificateUrl,
        String certificatePassword,
        CompanyStatus status
) {}
