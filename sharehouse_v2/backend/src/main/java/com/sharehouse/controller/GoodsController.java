package com.sharehouse.controller;

import com.sharehouse.model.Goods;
import com.sharehouse.repository.GoodsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/goods")
public class GoodsController {

    @Autowired
    private GoodsRepository goodsRepository;

    @GetMapping
    public List<Goods> getAll() {
        return goodsRepository.findAll();
    }

    @PostMapping
    public Goods create(@RequestBody Goods goods) {
        goods.setAdd_time(new Date());
        return goodsRepository.save(goods);
    }
}
