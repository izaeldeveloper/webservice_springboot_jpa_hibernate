package com.izadev.webservicesjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.izadev.webservicesjpahibernate.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
