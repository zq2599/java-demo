package com.bolingcavalry.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bolingcavalry.demo.entity.Seller;
import com.bolingcavalry.demo.service.SellerService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class SellerController {
    
    @Autowired
    private SellerService sellerService;

    @RequestMapping(value = "/seller/{id}", method = RequestMethod.GET)
    public Seller get(@PathVariable("id") Integer id) {
        log.info("get entity, id=[{}]", id);
        return sellerService.get(id);
    }
}
