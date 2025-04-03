package com.smoon.dreamShops.exceptions;

public class ProductNotFoundException  extends RuntimeException{
    public ProductNotFoundException(String message) {
        super(message);
    }
}
