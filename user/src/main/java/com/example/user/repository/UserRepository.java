package com.example.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.user.model.UserDto;

@Repository
public interface UserRepository extends JpaRepository<UserDto, Integer> {

}
