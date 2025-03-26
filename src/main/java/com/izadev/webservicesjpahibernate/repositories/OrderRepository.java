package com.izadev.webservicesjpahibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.izadev.webservicesjpahibernate.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
