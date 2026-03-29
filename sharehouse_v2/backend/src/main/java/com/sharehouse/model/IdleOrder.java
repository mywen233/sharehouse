package com.sharehouse.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "idleOrder")
public class IdleOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long idleid;

    @Column(name = "seller_uid", nullable = false)
    private Long sellerUid;

    @Column(name = "buyer_uid", nullable = false)
    private Long buyerUid;

    @Column(length = 200)
    private String idle;

    @Column(length = 20)
    private String shareType;

    private Integer price;
    private String lendTimeLong;
    private Integer fare;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date add_time;

    @Column(length = 100)
    private String deliveryType;

    private String deliveryLocation;
    private String pickupLocation;

    @Column(length = 1)
    private String hub_flag;

    @Column(length = 1)
    private String isComplete;

    @Column(length = 200)
    private String remark;

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL, orphanRemoval = true)
    private Logistic logistic;

    public IdleOrder() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getIdleid() { return idleid; }
    public void setIdleid(Long idleid) { this.idleid = idleid; }

    public Long getSellerUid() { return sellerUid; }
    public void setSellerUid(Long sellerUid) { this.sellerUid = sellerUid; }

    public Long getBuyerUid() { return buyerUid; }
    public void setBuyerUid(Long buyerUid) { this.buyerUid = buyerUid; }

    public String getIdle() { return idle; }
    public void setIdle(String idle) { this.idle = idle; }

    public String getShareType() { return shareType; }
    public void setShareType(String shareType) { this.shareType = shareType; }

    public Integer getPrice() { return price; }
    public void setPrice(Integer price) { this.price = price; }

    public String getLendTimeLong() { return lendTimeLong; }
    public void setLendTimeLong(String lendTimeLong) { this.lendTimeLong = lendTimeLong; }

    public Integer getFare() { return fare; }
    public void setFare(Integer fare) { this.fare = fare; }

    public Date getAdd_time() { return add_time; }
    public void setAdd_time(Date add_time) { this.add_time = add_time; }

    public String getDeliveryType() { return deliveryType; }
    public void setDeliveryType(String deliveryType) { this.deliveryType = deliveryType; }

    public String getDeliveryLocation() { return deliveryLocation; }
    public void setDeliveryLocation(String deliveryLocation) { this.deliveryLocation = deliveryLocation; }

    public String getPickupLocation() { return pickupLocation; }
    public void setPickupLocation(String pickupLocation) { this.pickupLocation = pickupLocation; }

    public String getHub_flag() { return hub_flag; }
    public void setHub_flag(String hub_flag) { this.hub_flag = hub_flag; }

    public String getIsComplete() { return isComplete; }
    public void setIsComplete(String isComplete) { this.isComplete = isComplete; }

    public String getRemark() { return remark; }
    public void setRemark(String remark) { this.remark = remark; }

    public Logistic getLogistic() { return logistic; }
    public void setLogistic(Logistic logistic) { this.logistic = logistic; }
}
