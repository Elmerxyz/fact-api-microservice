package com.ejdev.companyservice.contexts.company.infrastructure.dto;

import com.ejdev.companyservice.contexts.company.domain.model.CompanyStatus;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Schema(description = "Request to create a new company")
@Data
public class CreateCompanyRequest {
    @Schema(description = "RUC de la empresa", example = "20123456789")
    @NotBlank
    @Size(min = 11, max = 11)
    private String ruc;

    @Schema(description = "Razón social", example = "Mi Empresa SAC")
    @NotBlank
    @Size(max = 100)
    private String bussinessName;

    @Schema(description = "Dirección fiscal", example = "Av. Principal 123")
    @Size(max = 150)
    private String taxAddress;

    @Schema(description = "Teléfono", example = "999888777")
    @Size(max = 15)
    private String phone;

    @Schema(description = "Correo electrónico", example = "info@empresa.com")
    @Email
    @Size(max = 100)
    private String email;

    @Schema(description = "URL del logo", example = "https://logo.com/empresa.png")
    @Size(max = 255)
    private String logoUrl;

    @Schema(description = "Usuario SUNAT", example = "sunatUser")
    @Size(max = 50)
    private String sunatUser;

    @Schema(description = "Contraseña SUNAT", example = "password123")
    @Size(max = 250)
    private String sunatPassword;

    @Schema(description = "URL del certificado", example = "https://cert.com/cert.pfx")
    @Size(max = 255)
    private String certificateUrl;

    @Schema(description = "Contraseña del certificado", example = "certPass")
    @Size(max = 250)
    private String certificatePassword;

    @Schema(description = "Estado de la empresa", example = "ACTIVE")
    private CompanyStatus status;
}