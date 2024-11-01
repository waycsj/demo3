package com.example.demo2.repository;

import com.example.demo2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
//<>안에는 엔티티명, 기본키 타입  두개가 입력
public interface UserRepository extends JpaRepository<User, Integer>{
}
