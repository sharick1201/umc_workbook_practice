package com.example.umc_workbook_practice.repository.StoreRepository;


import com.example.umc_workbook_practice.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long>, StoreRepositoryCustom{}
