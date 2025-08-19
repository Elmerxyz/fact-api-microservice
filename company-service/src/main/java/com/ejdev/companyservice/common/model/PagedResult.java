package com.ejdev.companyservice.common.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PagedResult<T> {
    private List<T> items;
    private int totalItems;
    private int totalPages;
    private int currentPage;
    private int pageSize;
}
