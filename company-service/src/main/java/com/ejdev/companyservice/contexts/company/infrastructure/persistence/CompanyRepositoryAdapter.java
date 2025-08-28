package com.ejdev.companyservice.contexts.company.infrastructure.persistence;

import com.ejdev.companyservice.common.model.PagedResult;
import com.ejdev.companyservice.contexts.company.domain.model.Company;
import com.ejdev.companyservice.contexts.company.domain.model.CompanyFilter;
import com.ejdev.companyservice.contexts.company.domain.port.CompanyRepositoryPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;



@Repository
public class CompanyRepositoryAdapter  implements CompanyRepositoryPort {
    @Autowired
    private CompanyJpaRepository companyJpaRepository;

    @Override
    public void save(Company company) {
        var companyEntity = CompanyEntityMapper.toEntity(company);
        companyJpaRepository.save(companyEntity);
    }

    /**
     * @param companyId
     * @return
     */
    @Override
    public Optional<Company> findById(UUID companyId) {
        return Optional.empty();
    }

    /**
     * @param ruc
     * @return
     */
    @Override
    public Optional<Company> findByRuc(String ruc) {
        return Optional.empty();
    }

    /**
     * @param company
     */
    @Override
    public void update(Company company) {

    }

    /**
     * @param companyId
     */
    @Override
    public void delete(UUID companyId) {

    }

    /**
     * @param filter
     * @return
     */
    @Override
    public PagedResult<Company> findAll(CompanyFilter filter) {
        return null;
    }
}
