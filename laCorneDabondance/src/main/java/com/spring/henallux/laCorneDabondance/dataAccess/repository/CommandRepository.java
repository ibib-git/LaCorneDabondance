package com.spring.henallux.laCorneDabondance.dataAccess.repository;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.CommandEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface CommandRepository extends JpaRepository<CommandEntity,Integer> {

    CommandEntity findById(Integer id);
    ArrayList<CommandEntity> findAll();
}
