package com.ejdev.companyservice.contexts.company.application.CreateCompany;

import com.ejdev.companyservice.contexts.company.domain.model.Company;
import com.ejdev.companyservice.contexts.company.domain.port.CompanyRepositoryPort;
import com.ejdev.companyservice.contexts.company.domain.valueObject.CompanyId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateCompanyService {
   private final CompanyRepositoryPort repositoryPort;

   @Autowired
   public CreateCompanyService(CompanyRepositoryPort repositoryPort) {
       this.repositoryPort = repositoryPort;
   }

    public void execute(CreateCompanyDto createCompanyDto) {
    Company company = Company.builder()
        .companyId(CompanyId.generate())
        .ruc(createCompanyDto.ruc())
        .bussinessName(createCompanyDto.bussinessName())
        .taxAddress(createCompanyDto.taxAddress())
        .phone(createCompanyDto.phone())
        .email(createCompanyDto.email())
        .logoUrl(createCompanyDto.logoUrl())
        .sunatUser(createCompanyDto.sunatUser())
        .sunatPassword(createCompanyDto.sunatPassword())
        .certificateUrl(createCompanyDto.certificateUrl())
        .certificatePassword(createCompanyDto.certificatePassword())
        .status(createCompanyDto.status())
        .build();

        repositoryPort.save(company);
    }

}
