package com.spring.henallux.laCorneDabondance.dataAccess.repository;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.TraductionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface TraductionRepository extends JpaRepository<TraductionEntity,String> {

    TraductionEntity findByCategoryAndLanguage(Integer category,Integer language);
    ArrayList<TraductionEntity> findAll();
}
