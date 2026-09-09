package com.app.ecom.dto;

import lombok.Data;

@Data
public class CartItemResponse {
    private String id;
    private String quantity;
    private String price;
}
