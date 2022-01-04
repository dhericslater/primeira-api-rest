package com.department.userdep.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.department.userdep.entidades.User;

public interface UserRepositories extends JpaRepository<User, Long> {

}
