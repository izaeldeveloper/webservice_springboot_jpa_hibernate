package com.izadev.webservicesjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.izadev.webservicesjpahibernate.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
