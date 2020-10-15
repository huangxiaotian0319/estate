package test.domain;

import java.util.Date;

public class Recieve {
    private Integer userId;

    private String userName;

    private Short isView;

    private Long adId;

    private Byte adType;

    private Boolean isDel;

    private Date crtime;

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

    public Short getIsView() {
        return isView;
    }

    public void setIsView(Short isView) {
        this.isView = isView;
    }

    public Long getAdId() {
        return adId;
    }

    public void setAdId(Long adId) {
        this.adId = adId;
    }

    public Byte getAdType() {
        return adType;
    }

    public void setAdType(Byte adType) {
        this.adType = adType;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public Date getCrtime() {
        return crtime;
    }

    public void setCrtime(Date crtime) {
        this.crtime = crtime;
    }
}