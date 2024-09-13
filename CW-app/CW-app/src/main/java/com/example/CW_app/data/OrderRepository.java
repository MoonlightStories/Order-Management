package com.example.CW_app.data;

import org.springframework.data.jpa.repository.JpaRepository;


import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Integer>{

    List<Order> findByUserid(int userid);

}
