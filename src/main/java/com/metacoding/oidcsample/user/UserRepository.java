package com.metacoding.oidcsample.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

// JpaRepository 상속하면 기본 CRUD 만들어줍니다.
public interface UserRepository extends JpaRepository<User, Integer> {

    // 추가적으로 필요한 메서드는 개발자가 작성
    @Query("SELECT u FROM User u WHERE u.username = :username")
    Optional<User> findByUsername(@Param("username") String username);
}