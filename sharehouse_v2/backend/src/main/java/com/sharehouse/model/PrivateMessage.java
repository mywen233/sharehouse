package com.sharehouse.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "privateMessage")
public class PrivateMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long userid;

    @Column(nullable = false)
    private Long senderid;

    @Column(nullable = false)
    private String content;

    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date sendTime;

    @Column(length = 1)
    private String isPublic;

    public PrivateMessage() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getUserid() { return userid; }
    public void setUserid(Long userid) { this.userid = userid; }

    public Long getSenderid() { return senderid; }
    public void setSenderid(Long senderid) { this.senderid = senderid; }

    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }

    public Date getSendTime() { return sendTime; }
    public void setSendTime(Date sendTime) { this.sendTime = sendTime; }

    public String getIsPublic() { return isPublic; }
    public void setIsPublic(String isPublic) { this.isPublic = isPublic; }
}
