package com.ejdev.companyservice.contexts.company.domain.model;

import com.ejdev.companyservice.common.filter.BaseFilter;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CompanyFilter extends BaseFilter {
    private List<CompanyStatus> statuses;
    private String searchTerm;
    private String sortBy;
    private boolean ascending;
    private int currentPage;
    private int pageSize;
}