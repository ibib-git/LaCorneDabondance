package com.spring.henallux.laCorneDabondance.dataAccess.repository;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.LanguageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<LanguageEntity,Integer> {

    LanguageEntity findByLabel (String label);
}
