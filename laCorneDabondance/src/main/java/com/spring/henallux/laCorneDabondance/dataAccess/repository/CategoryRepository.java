package com.spring.henallux.laCorneDabondance.dataAccess.repository;


import com.spring.henallux.laCorneDabondance.dataAccess.entity.CategoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository <CategoryEntity, Integer> {

    //ArrayList<CategoryEntity> findAll();

}
