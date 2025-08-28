package com.ejdev.companyservice.contexts.company.infrastructure.controller;

import com.ejdev.companyservice.contexts.company.application.CreateCompany.CreateCompanyDto;
import com.ejdev.companyservice.contexts.company.application.CreateCompany.CreateCompanyService;
import com.ejdev.companyservice.contexts.company.domain.model.Company;
import com.ejdev.companyservice.contexts.company.infrastructure.dto.CreateCompanyRequest;

import common.hearelmer.shared.dto.BaseResponse;
import common.hearelmer.shared.util.ResponseBuilder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping()
@RequiredArgsConstructor
public class CompanyController {
    private final CreateCompanyService createCompanyService;

    @PostMapping()
    public ResponseEntity<Void> createCompany(@RequestBody CreateCompanyRequest createCompanyRequest) {
        var createCompanyDto = CreateCompanyDto.builder()
                .ruc(createCompanyRequest.getRuc())
                .bussinessName(createCompanyRequest.getBussinessName())
                .taxAddress(createCompanyRequest.getTaxAddress())
                .phone(createCompanyRequest.getPhone())
                .email(createCompanyRequest.getEmail())
                .logoUrl(createCompanyRequest.getLogoUrl())
                .sunatUser(createCompanyRequest.getSunatUser())
                .sunatPassword(createCompanyRequest.getSunatPassword())
                .certificateUrl(createCompanyRequest.getCertificateUrl())
                .certificatePassword(createCompanyRequest.getCertificatePassword())
                .status(createCompanyRequest.getStatus())
                .build();
         createCompanyService.execute(createCompanyDto);
         var response = ResponseBuilder.success("Company created successfully", BaseResponse.class);
        System.out.println(response);
        return new ResponseEntity<>(  HttpStatus.CREATED);
    }

    @GetMapping()
    public ResponseEntity<BaseResponse> getCompany() {
        // This method is a placeholder for future implementation
        var response = ResponseBuilder.success("Get company not implemented yet", BaseResponse.class);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("health")
    public ResponseEntity<String> healthCheck() {
        return new ResponseEntity<>("Company Service is up and running", HttpStatus.OK);
    }
}
