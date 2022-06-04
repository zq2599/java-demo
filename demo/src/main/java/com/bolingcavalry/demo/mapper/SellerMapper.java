package com.bolingcavalry.demo.mapper;

import org.springframework.stereotype.Repository;
import com.bolingcavalry.demo.entity.Seller;

@Repository
public interface SellerMapper {
    Seller sel(int id);
}