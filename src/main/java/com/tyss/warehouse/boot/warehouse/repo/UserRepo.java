package com.tyss.warehouse.boot.warehouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tyss.warehouse.boot.warehouse.entity.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
