package com.AfafProject.ecommerce.service;

import com.AfafProject.ecommerce.dto.Purchase;
import com.AfafProject.ecommerce.dto.PurchaseResponse;

public interface CheckOutService {

    PurchaseResponse placeOrder(Purchase purchase);
}
