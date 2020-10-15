package test.domain;

import java.util.Date;

public class Praise {
    private Long adId;

    private Byte adType;

    private Integer pushId;

    private String pushTitle;

    private Integer praiseCount;

    private Integer prasieId;

    private Integer pushUserId;

    private Integer prasieUserId;

    private Date crtime;

    private Integer order;

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

    public Integer getPushId() {
        return pushId;
    }

    public void setPushId(Integer pushId) {
        this.pushId = pushId;
    }

    public String getPushTitle() {
        return pushTitle;
    }

    public void setPushTitle(String pushTitle) {
        this.pushTitle = pushTitle == null ? null : pushTitle.trim();
    }

    public Integer getPraiseCount() {
        return praiseCount;
    }

    public void setPraiseCount(Integer praiseCount) {
        this.praiseCount = praiseCount;
    }

    public Integer getPrasieId() {
        return prasieId;
    }

    public void setPrasieId(Integer prasieId) {
        this.prasieId = prasieId;
    }

    public Integer getPushUserId() {
        return pushUserId;
    }

    public void setPushUserId(Integer pushUserId) {
        this.pushUserId = pushUserId;
    }

    public Integer getPrasieUserId() {
        return prasieUserId;
    }

    public void setPrasieUserId(Integer prasieUserId) {
        this.prasieUserId = prasieUserId;
    }

    public Date getCrtime() {
        return crtime;
    }

    public void setCrtime(Date crtime) {
        this.crtime = crtime;
    }

    public Integer getOrder() {
        return order;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}