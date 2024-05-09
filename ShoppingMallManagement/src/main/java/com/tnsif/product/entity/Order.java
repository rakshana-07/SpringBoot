package com.tnsif.product.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {
	         @Id
	         @GeneratedValue(strategy = GenerationType.IDENTITY)
             private Long id;
             private String ordername;
             private double totalprice;
             private String status;
             private Long customerId;
             
			public Order() {
				super();
			}

			public Order(String ordername, double totalprice, String status, Long customerId) {
				super();
				this.ordername = ordername;
				this.totalprice = totalprice;
				this.status = status;
				this.customerId = customerId;
			}



			public Long getId() {
				return id;
			}
			
			
			
			public void setId(Long id) {
				this.id = id;
			}
			public String getOrdername() {
				return ordername;
			}
			public void setOrdername(String ordername) {
				this.ordername = ordername;
			}
			public double getTotalprice() {
				return totalprice;
			}
			public void setTotalprice(double totalprice) {
				this.totalprice = totalprice;
			}
			public String getStatus() {
				return status;
			}
			public void setStatus(String status) {
				this.status = status;
			}
			public Long getCustomerId() {
				return customerId;
			}
			public void setCustomerId(Long customerId) {
				this.customerId = customerId;
			}
             
             
             
             
             }
