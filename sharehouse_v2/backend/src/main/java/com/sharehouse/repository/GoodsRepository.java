package com.sharehouse.repository;

import com.sharehouse.model.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoodsRepository extends JpaRepository<Goods, Long> {
    List<Goods> findByUserid(Long userid);
}
