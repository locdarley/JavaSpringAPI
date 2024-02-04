package com.fsp.fsp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsp.fsp.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
