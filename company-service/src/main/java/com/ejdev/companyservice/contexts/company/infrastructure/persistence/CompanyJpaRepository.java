package com.ejdev.companyservice.contexts.company.infrastructure.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CompanyJpaRepository extends JpaRepository<CompanyEntity , UUID> {
    // Additional query methods can be defined here if needed
}
