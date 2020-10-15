package test.domain;

import java.util.Date;

public class Shield {
    private Integer userId;

    private String userName;

    private Integer shieldId;

    private Integer blackedObjectId;

    private Date crtime;

    private Byte objectType;

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

    public Integer getShieldId() {
        return shieldId;
    }

    public void setShieldId(Integer shieldId) {
        this.shieldId = shieldId;
    }

    public Integer getBlackedObjectId() {
        return blackedObjectId;
    }

    public void setBlackedObjectId(Integer blackedObjectId) {
        this.blackedObjectId = blackedObjectId;
    }

    public Date getCrtime() {
        return crtime;
    }

    public void setCrtime(Date crtime) {
        this.crtime = crtime;
    }

    public Byte getObjectType() {
        return objectType;
    }

    public void setObjectType(Byte objectType) {
        this.objectType = objectType;
    }
}