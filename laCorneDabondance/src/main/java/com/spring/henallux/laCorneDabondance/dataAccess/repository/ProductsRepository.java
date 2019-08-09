package com.spring.henallux.laCorneDabondance.dataAccess.repository;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.ProductsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;

@Repository
public interface ProductsRepository extends JpaRepository<ProductsEntity, Integer> {

    public ProductsEntity  findById(int id);
    public ArrayList<ProductsEntity> findAll();
}
