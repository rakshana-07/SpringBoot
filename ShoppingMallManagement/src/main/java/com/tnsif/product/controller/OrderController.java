package com.tnsif.product.controller;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.tnsif.product.entity.Order;
import com.tnsif.product.repository.OrderRepository;
@RestController
public class OrderController<Product> {
	          
	          @Autowired
	          OrderRepository repo;
	
	          
	          @PostMapping("/product")
               public Order addProduct(@RequestBody Order O)
               {
	        	   return repo.save(O);
            	   
               }
	          @GetMapping("/Product")
               public List<Order> getProducts()
               {
            	  return repo.findAll();
               }
	          @GetMapping("/product/{id}")
               public Order getProductById(@PathVariable    Long id)
               {
            	  return  repo.findById(id).get();  
               }  
	            @DeleteMapping("/product/{id}")
                public void deleteProduct(@PathVariable Long id)
               
	           { 	
	            	repo.deleteById(id);
                }
               
	            @PutMapping("/Product")
	            public Order updateProduct(@PathVariable Long id,@RequestBody Order O)
	            {
	            	O.setId(id);
	            	return repo.save(O);
	            }
	            
	            
               
}