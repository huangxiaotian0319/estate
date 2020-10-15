package test.domain;

import java.util.Date;

public class DynamicRetran {
    private Integer danymicId;

    private Integer retranId;

    private Integer dynamicUserId;

    private String dynamicUserName;

    private Integer retranUserId;

    private String retranUserName;

    private Date retranTime;

    private Integer retranOrder;

    private Boolean isDel;

    public Integer getDanymicId() {
        return danymicId;
    }

    public void setDanymicId(Integer danymicId) {
        this.danymicId = danymicId;
    }

    public Integer getRetranId() {
        return retranId;
    }

    public void setRetranId(Integer retranId) {
        this.retranId = retranId;
    }

    public Integer getDynamicUserId() {
        return dynamicUserId;
    }

    public void setDynamicUserId(Integer dynamicUserId) {
        this.dynamicUserId = dynamicUserId;
    }

    public String getDynamicUserName() {
        return dynamicUserName;
    }

    public void setDynamicUserName(String dynamicUserName) {
        this.dynamicUserName = dynamicUserName == null ? null : dynamicUserName.trim();
    }

    public Integer getRetranUserId() {
        return retranUserId;
    }

    public void setRetranUserId(Integer retranUserId) {
        this.retranUserId = retranUserId;
    }

    public String getRetranUserName() {
        return retranUserName;
    }

    public void setRetranUserName(String retranUserName) {
        this.retranUserName = retranUserName == null ? null : retranUserName.trim();
    }

    public Date getRetranTime() {
        return retranTime;
    }

    public void setRetranTime(Date retranTime) {
        this.retranTime = retranTime;
    }

    public Integer getRetranOrder() {
        return retranOrder;
    }

    public void setRetranOrder(Integer retranOrder) {
        this.retranOrder = retranOrder;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }
}