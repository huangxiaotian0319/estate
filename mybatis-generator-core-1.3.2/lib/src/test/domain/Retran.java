package test.domain;

import java.util.Date;

public class Retran {
    private Long adId;

    private Integer pushId;

    private String pushTitle;

    private Integer retranCount;

    private Integer retranId;

    private Integer pushUserId;

    private Integer retranUserId;

    private Date crtime;

    private Integer order;

    private Boolean isDel;

    public Long getAdId() {
        return adId;
    }

    public void setAdId(Long adId) {
        this.adId = adId;
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

    public Integer getRetranCount() {
        return retranCount;
    }

    public void setRetranCount(Integer retranCount) {
        this.retranCount = retranCount;
    }

    public Integer getRetranId() {
        return retranId;
    }

    public void setRetranId(Integer retranId) {
        this.retranId = retranId;
    }

    public Integer getPushUserId() {
        return pushUserId;
    }

    public void setPushUserId(Integer pushUserId) {
        this.pushUserId = pushUserId;
    }

    public Integer getRetranUserId() {
        return retranUserId;
    }

    public void setRetranUserId(Integer retranUserId) {
        this.retranUserId = retranUserId;
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

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }
}