package com.spring.henallux.laCorneDabondance.dataAccess.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.henallux.laCorneDabondance.dataAccess.entity.UserEntity;
import javax.transaction.Transactional;


@Repository
@Transactional
public interface UserRepository extends JpaRepository<UserEntity, String> {

    UserEntity findByLogin (String login);
}