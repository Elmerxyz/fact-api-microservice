package com.ejdev.companyservice.contexts.company.infrastructure.persistence;

import com.ejdev.companyservice.contexts.company.domain.model.CompanyStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "companies")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CompanyEntity {
    @Id
    @Column(name = "company_id", nullable = false, unique = true)
    private UUID companyId;

    @Column(name = "ruc", length = 11, nullable = false, unique = true)
    private String ruc;

    @Column(name = "bussiness_name", length = 100, nullable = false)
    private String bussinessName;

    @Column(name = "tax_address", length = 150)
    private String taxAddress;

    @Column(name = "phone", length = 15, unique = true)
    private String phone;

    @Column(name = "email", length = 100, unique = true)
    private String email;

    @Column(name = "logo_url", length = 255)
    private String logoUrl;

    @Column(name = "sunat_user", length = 50)
    private String sunatUser;

    @Column(name = "sunat_password", length = 50)
    private String sunatPassword;

    @Column(name = "certificate_url", length = 255)
    private String certificateUrl;

    @Column(name = "certificate_password", length = 50)
    private String certificatePassword;

    @Column(name = "status", length = 20)
    private CompanyStatus status;
}
