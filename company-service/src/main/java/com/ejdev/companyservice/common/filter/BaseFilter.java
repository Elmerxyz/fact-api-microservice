package com.ejdev.companyservice.common.filter;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseFilter {
    private int pageSize;
    private int currentPage;
}
