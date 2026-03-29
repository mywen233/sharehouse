package com.sharehouse.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "goods")
public class Goods {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userid;

    @Column(nullable = false)
    private String type;

    private String goodstype_1;
    private String goodstype_2;
    private String goodstype_3;

    @Column(nullable = false)
    private String goods;

    private String content;

    @Column(nullable = false)
    private Integer reward;

    private String obj_qq;
    private String obj_phone;
    private Integer price;
    private String totaltime;
    private String old_degree;

    @Column(nullable = false)
    private String is_shared;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date add_time;

    private String show_inhome;
    private Integer comment_size;
    private String firstimg_url;
    private Integer lookedtimes;
    private Integer requiredtimes;
    private Integer replytimes;
    private Integer savetime;
    private String contactperson;
    private String show_privacy;
    private Integer hotspot;
    private String goodslink;

    @Column(length = 10)
    private String bargain;

    @Column(length = 300)
    private String idle_alphabets;

    public Goods() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUserid() { return userid; }
    public void setUserid(Long userid) { this.userid = userid; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getGoodstype_1() { return goodstype_1; }
    public void setGoodstype_1(String goodstype_1) { this.goodstype_1 = goodstype_1; }

    public String getGoodstype_2() { return goodstype_2; }
    public void setGoodstype_2(String goodstype_2) { this.goodstype_2 = goodstype_2; }

    public String getGoodstype_3() { return goodstype_3; }
    public void setGoodstype_3(String goodstype_3) { this.goodstype_3 = goodstype_3; }

    public String getGoods() { return goods; }
    public void setGoods(String goods) { this.goods = goods; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Integer getReward() { return reward; }
    public void setReward(Integer reward) { this.reward = reward; }

    public String getObj_qq() { return obj_qq; }
    public void setObj_qq(String obj_qq) { this.obj_qq = obj_qq; }

    public String getObj_phone() { return obj_phone; }
    public void setObj_phone(String obj_phone) { this.obj_phone = obj_phone; }

    public Integer getPrice() { return price; }
    public void setPrice(Integer price) { this.price = price; }

    public String getTotaltime() { return totaltime; }
    public void setTotaltime(String totaltime) { this.totaltime = totaltime; }

    public String getOld_degree() { return old_degree; }
    public void setOld_degree(String old_degree) { this.old_degree = old_degree; }

    public String getIs_shared() { return is_shared; }
    public void setIs_shared(String is_shared) { this.is_shared = is_shared; }

    public Date getAdd_time() { return add_time; }
    public void setAdd_time(Date add_time) { this.add_time = add_time; }

    public String getShow_inhome() { return show_inhome; }
    public void setShow_inhome(String show_inhome) { this.show_inhome = show_inhome; }

    public Integer getComment_size() { return comment_size; }
    public void setComment_size(Integer comment_size) { this.comment_size = comment_size; }

    public String getFirstimg_url() { return firstimg_url; }
    public void setFirstimg_url(String firstimg_url) { this.firstimg_url = firstimg_url; }

    public Integer getLookedtimes() { return lookedtimes; }
    public void setLookedtimes(Integer lookedtimes) { this.lookedtimes = lookedtimes; }

    public Integer getRequiredtimes() { return requiredtimes; }
    public void setRequiredtimes(Integer requiredtimes) { this.requiredtimes = requiredtimes; }

    public Integer getReplytimes() { return replytimes; }
    public void setReplytimes(Integer replytimes) { this.replytimes = replytimes; }

    public Integer getSavetime() { return savetime; }
    public void setSavetime(Integer savetime) { this.savetime = savetime; }

    public String getContactperson() { return contactperson; }
    public void setContactperson(String contactperson) { this.contactperson = contactperson; }

    public String getShow_privacy() { return show_privacy; }
    public void setShow_privacy(String show_privacy) { this.show_privacy = show_privacy; }

    public Integer getHotspot() { return hotspot; }
    public void setHotspot(Integer hotspot) { this.hotspot = hotspot; }

    public String getGoodslink() { return goodslink; }
    public void setGoodslink(String goodslink) { this.goodslink = goodslink; }

    public String getBargain() { return bargain; }
    public void setBargain(String bargain) { this.bargain = bargain; }

    public String getIdle_alphabets() { return idle_alphabets; }
    public void setIdle_alphabets(String idle_alphabets) { this.idle_alphabets = idle_alphabets; }
}
