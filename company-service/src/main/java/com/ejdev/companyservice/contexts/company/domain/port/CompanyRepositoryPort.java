package com.ejdev.companyservice.contexts.company.domain.port;

import com.ejdev.companyservice.common.model.PagedResult;
import com.ejdev.companyservice.contexts.company.domain.model.Company;
import com.ejdev.companyservice.contexts.company.domain.model.CompanyFilter;

import java.util.Optional;
import java.util.UUID;

public interface CompanyRepositoryPort {
    void save(Company company);

    Optional<Company> findById(UUID companyId);

    Optional<Company> findByRuc(String ruc);

    void update(Company company);

    void delete(UUID companyId);

    PagedResult<Company> findAll(CompanyFilter filter);
}
