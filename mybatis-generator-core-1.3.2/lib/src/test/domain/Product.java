package test.domain;

import java.util.Date;

public class Product {
    private Integer userId;

    private String userName;

    private Integer productId;

    private String productName;

    private Integer displayOrder;

    private String photo;

    private String intro;

    private Boolean mark;

    private Integer reserve;

    private Float price;

    private Date endTime;

    private Date crtime;

    private Integer grouptypeId;

    private String grouptypeName;

    private Integer fatherId;

    private Integer order;

    private Date producttagcrtime;

    private Boolean isNorm;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }

    public Boolean getMark() {
        return mark;
    }

    public void setMark(Boolean mark) {
        this.mark = mark;
    }

    public Integer getReserve() {
        return reserve;
    }

    public void setReserve(Integer reserve) {
        this.reserve = reserve;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCrtime() {
        return crtime;
    }

    public void setCrtime(Date crtime) {
        this.crtime = crtime;
    }

    public Integer getGrouptypeId() {
        return grouptypeId;
    }

    public void setGrouptypeId(Integer grouptypeId) {
        this.grouptypeId = grouptypeId;
    }

    public String getGrouptypeName() {
        return grouptypeName;
    }

    public void setGrouptypeName(String grouptypeName) {
        this.grouptypeName = grouptypeName == null ? null : grouptypeName.trim();
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }

    public Date getProducttagcrtime() {
        return producttagcrtime;
    }

    public void setProducttagcrtime(Date producttagcrtime) {
        this.producttagcrtime = producttagcrtime;
    }

    public Boolean getIsNorm() {
        return isNorm;
    }

    public void setIsNorm(Boolean isNorm) {
        this.isNorm = isNorm;
    }
}