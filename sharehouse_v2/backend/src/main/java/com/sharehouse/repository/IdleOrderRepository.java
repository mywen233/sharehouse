package com.sharehouse.repository;

import com.sharehouse.model.IdleOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IdleOrderRepository extends JpaRepository<IdleOrder, Long> {
    List<IdleOrder> findBySellerUid(Long sellerUid);
    List<IdleOrder> findByBuyerUid(Long buyerUid);
}
