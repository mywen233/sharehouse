package com.sharehouse.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "logistic")
public class Logistic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String log_info;

    @Column(nullable = false)
    private String op_user;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date add_time;

    // ManyToOne to IdleOrder (if bidirectional)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "order_id")
    private IdleOrder order;

    public Logistic() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getLog_info() { return log_info; }
    public void setLog_info(String log_info) { this.log_info = log_info; }

    public String getOp_user() { return op_user; }
    public void setOp_user(String op_user) { this.op_user = op_user; }

    public Date getAdd_time() { return add_time; }
    public void setAdd_time(Date add_time) { this.add_time = add_time; }

    public IdleOrder getOrder() { return order; }
    public void setOrder(IdleOrder order) { this.order = order; }
}
