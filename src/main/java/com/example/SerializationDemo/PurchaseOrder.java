package com.example.SerializationDemo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuppressWarnings("serial")
public class PurchaseOrder implements Serializable {
    private String orderId;
    private String company;
    private int qty;
    private double price;
}
