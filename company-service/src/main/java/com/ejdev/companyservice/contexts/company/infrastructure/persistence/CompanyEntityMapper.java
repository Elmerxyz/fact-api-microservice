package com.ejdev.companyservice.contexts.company.infrastructure.persistence;

import com.ejdev.companyservice.contexts.company.domain.model.Company;
import com.ejdev.companyservice.contexts.company.domain.valueObject.CompanyId;

import java.util.UUID;

public class CompanyEntityMapper {
    public static CompanyEntity toEntity(Company domain) {
         return CompanyEntity.builder()
                 .companyId(domain.getCompanyId().getValueAsUUID())
                    .ruc(domain.getRuc())
                    .bussinessName(domain.getBussinessName())
                    .taxAddress(domain.getTaxAddress())
                    .phone(domain.getPhone())
                    .email(domain.getEmail())
                    .logoUrl(domain.getLogoUrl())
                    .sunatUser(domain.getSunatUser())
                    .sunatPassword(domain.getSunatPassword())
                    .certificateUrl(domain.getCertificateUrl())
                    .certificatePassword(domain.getCertificatePassword())
                    .status(domain.getStatus())
                 .build();
    }

    public static Company toDomain(CompanyEntity entity) {
        return  Company.builder()
                .companyId(CompanyId.of(entity.getCompanyId().toString()))
                .ruc(entity.getRuc())
                .bussinessName(entity.getBussinessName())
                .taxAddress(entity.getTaxAddress())
                .phone(entity.getPhone())
                .email(entity.getEmail())
                .logoUrl(entity.getLogoUrl())
                .sunatUser(entity.getSunatUser())
                .sunatPassword(entity.getSunatPassword())
                .certificateUrl(entity.getCertificateUrl())
                .certificatePassword(entity.getCertificatePassword())
                .status(entity.getStatus())
                .build();
    }

}
