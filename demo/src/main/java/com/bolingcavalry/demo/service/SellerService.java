package com.bolingcavalry.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bolingcavalry.demo.entity.Seller;
import com.bolingcavalry.demo.mapper.SellerMapper;

@Service
public class SellerService {
    
    @Autowired
    SellerMapper sellerMapper;

    public Seller get(Integer id) {
        return sellerMapper.sel(id);
    }
}
