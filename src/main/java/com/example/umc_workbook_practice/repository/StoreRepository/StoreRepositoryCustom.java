package com.example.umc_workbook_practice.repository.StoreRepository;

import com.example.umc_workbook_practice.domain.Store;

import java.util.List;

public interface StoreRepositoryCustom {
    List<Store> dynamicQueryWithBooleanBuilder(String name, Float score);

}
