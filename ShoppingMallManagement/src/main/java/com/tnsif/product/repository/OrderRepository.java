package com.tnsif.product.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.tnsif.product.entity.Order;
public interface OrderRepository extends JpaRepository <Order,Long>{ 
}
