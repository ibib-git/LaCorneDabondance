package com.spring.henallux.laCorneDabondance.dataAccess.repository;

import com.spring.henallux.laCorneDabondance.dataAccess.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import javax.transaction.Transactional;


@Repository
@Transactional
public interface UserRepository extends JpaRepository<UserEntity, String> {

    UserEntity findByUsername (String username);
}
