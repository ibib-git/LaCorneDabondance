package com.spring.henallux.laCorneDabondance.dataAccess.repository;


import com.spring.henallux.laCorneDabondance.dataAccess.entity.OrderLineEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderLineRepository extends JpaRepository<OrderLineEntity,Integer> {

    OrderLineEntity findById(Integer id);
   // OrderLineEntity findAllByCommandId();

}
