package com.sharehouse.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
@Table(name = "sh_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nickname;
    private String realname;
    private String email;
    private String password;
    private String sex;
    private Integer age;
    private String birthday;
    private String home;
    private String constellation;
    
    @Column(name = "xx")
    private String sx; // Column xx in hbm
    
    private String marry;
    private String blood;
    private String introduce;
    private String autologin;
    private String is_pass;
    private String phone;
    private String province;
    private String city;
    private String school;
    private String department;
    private String qq;
    private String open_id;
    private String type;
    private String head_ico;
    private String head_ico_big;
    private String freeze;
    private Integer visted_times;
    
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date add_time;
    
    private String register_ip;
    private String lastlogin_ip;
    private Integer coin;
    private Integer reputation;
    private Integer level;
    private Integer friend_number;
    private Integer circle_number;
    
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date lastlogin_time;
    
    private Integer continue_online;
    private Integer login_active;
    private Integer send_active;
    
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date lastsendtime;

    // Privacy fields
    private String privacy_myPage;
    private String privacy_myCircleList;
    private String privacy_myUserList;
    private String privacy_myMsgList;
    private String privacy_useNickName;
    private String privacy_pInfo;
    private String privacy_pShowUser;
    private String privacy_pShowCircle;
    
    private String isNewUser;
    private String registerByAPI;
    private String hs_year;
    private String educational;
    private String dorm;
    private String campus;

    // Default Constructor
    public User() {}

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNickname() { return nickname; }
    public void setNickname(String nickname) { this.nickname = nickname; }

    public String getRealname() { return realname; }
    public void setRealname(String realname) { this.realname = realname; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getSex() { return sex; }
    public void setSex(String sex) { this.sex = sex; }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getBirthday() { return birthday; }
    public void setBirthday(String birthday) { this.birthday = birthday; }

    public String getHome() { return home; }
    public void setHome(String home) { this.home = home; }

    public String getConstellation() { return constellation; }
    public void setConstellation(String constellation) { this.constellation = constellation; }

    public String getSx() { return sx; }
    public void setSx(String sx) { this.sx = sx; }

    public String getMarry() { return marry; }
    public void setMarry(String marry) { this.marry = marry; }

    public String getBlood() { return blood; }
    public void setBlood(String blood) { this.blood = blood; }

    public String getIntroduce() { return introduce; }
    public void setIntroduce(String introduce) { this.introduce = introduce; }

    public String getAutologin() { return autologin; }
    public void setAutologin(String autologin) { this.autologin = autologin; }

    public String getIs_pass() { return is_pass; }
    public void setIs_pass(String is_pass) { this.is_pass = is_pass; }

    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }

    public String getProvince() { return province; }
    public void setProvince(String province) { this.province = province; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getSchool() { return school; }
    public void setSchool(String school) { this.school = school; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    public String getQq() { return qq; }
    public void setQq(String qq) { this.qq = qq; }

    public String getOpen_id() { return open_id; }
    public void setOpen_id(String open_id) { this.open_id = open_id; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public String getHead_ico() { return head_ico; }
    public void setHead_ico(String head_ico) { this.head_ico = head_ico; }

    public String getHead_ico_big() { return head_ico_big; }
    public void setHead_ico_big(String head_ico_big) { this.head_ico_big = head_ico_big; }

    public String getFreeze() { return freeze; }
    public void setFreeze(String freeze) { this.freeze = freeze; }

    public Integer getVisted_times() { return visted_times; }
    public void setVisted_times(Integer visted_times) { this.visted_times = visted_times; }

    public Date getAdd_time() { return add_time; }
    public void setAdd_time(Date add_time) { this.add_time = add_time; }

    public String getRegister_ip() { return register_ip; }
    public void setRegister_ip(String register_ip) { this.register_ip = register_ip; }

    public String getLastlogin_ip() { return lastlogin_ip; }
    public void setLastlogin_ip(String lastlogin_ip) { this.lastlogin_ip = lastlogin_ip; }

    public Integer getCoin() { return coin; }
    public void setCoin(Integer coin) { this.coin = coin; }

    public Integer getReputation() { return reputation; }
    public void setReputation(Integer reputation) { this.reputation = reputation; }

    public Integer getLevel() { return level; }
    public void setLevel(Integer level) { this.level = level; }

    public Integer getFriend_number() { return friend_number; }
    public void setFriend_number(Integer friend_number) { this.friend_number = friend_number; }

    public Integer getCircle_number() { return circle_number; }
    public void setCircle_number(Integer circle_number) { this.circle_number = circle_number; }

    public Date getLastlogin_time() { return lastlogin_time; }
    public void setLastlogin_time(Date lastlogin_time) { this.lastlogin_time = lastlogin_time; }

    public Integer getContinue_online() { return continue_online; }
    public void setContinue_online(Integer continue_online) { this.continue_online = continue_online; }

    public Integer getLogin_active() { return login_active; }
    public void setLogin_active(Integer login_active) { this.login_active = login_active; }

    public Integer getSend_active() { return send_active; }
    public void setSend_active(Integer send_active) { this.send_active = send_active; }

    public Date getLastsendtime() { return lastsendtime; }
    public void setLastsendtime(Date lastsendtime) { this.lastsendtime = lastsendtime; }

    public String getPrivacy_myPage() { return privacy_myPage; }
    public void setPrivacy_myPage(String privacy_myPage) { this.privacy_myPage = privacy_myPage; }

    public String getPrivacy_myCircleList() { return privacy_myCircleList; }
    public void setPrivacy_myCircleList(String privacy_myCircleList) { this.privacy_myCircleList = privacy_myCircleList; }

    public String getPrivacy_myUserList() { return privacy_myUserList; }
    public void setPrivacy_myUserList(String privacy_myUserList) { this.privacy_myUserList = privacy_myUserList; }

    public String getPrivacy_myMsgList() { return privacy_myMsgList; }
    public void setPrivacy_myMsgList(String privacy_myMsgList) { this.privacy_myMsgList = privacy_myMsgList; }

    public String getPrivacy_useNickName() { return privacy_useNickName; }
    public void setPrivacy_useNickName(String privacy_useNickName) { this.privacy_useNickName = privacy_useNickName; }

    public String getPrivacy_pInfo() { return privacy_pInfo; }
    public void setPrivacy_pInfo(String privacy_pInfo) { this.privacy_pInfo = privacy_pInfo; }

    public String getPrivacy_pShowUser() { return privacy_pShowUser; }
    public void setPrivacy_pShowUser(String privacy_pShowUser) { this.privacy_pShowUser = privacy_pShowUser; }

    public String getPrivacy_pShowCircle() { return privacy_pShowCircle; }
    public void setPrivacy_pShowCircle(String privacy_pShowCircle) { this.privacy_pShowCircle = privacy_pShowCircle; }

    public String getIsNewUser() { return isNewUser; }
    public void setIsNewUser(String isNewUser) { this.isNewUser = isNewUser; }

    public String getRegisterByAPI() { return registerByAPI; }
    public void setRegisterByAPI(String registerByAPI) { this.registerByAPI = registerByAPI; }

    public String getHs_year() { return hs_year; }
    public void setHs_year(String hs_year) { this.hs_year = hs_year; }

    public String getEducational() { return educational; }
    public void setEducational(String educational) { this.educational = educational; }

    public String getDorm() { return dorm; }
    public void setDorm(String dorm) { this.dorm = dorm; }

    public String getCampus() { return campus; }
    public void setCampus(String campus) { this.campus = campus; }
}
