package com.AfafProject.ecommerce.dto;

import com.AfafProject.ecommerce.entity.Address;
import com.AfafProject.ecommerce.entity.Customer;
import com.AfafProject.ecommerce.entity.Order;
import com.AfafProject.ecommerce.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;

}

