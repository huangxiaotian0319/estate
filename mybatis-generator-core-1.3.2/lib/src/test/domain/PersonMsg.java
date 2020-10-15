package test.domain;

import java.util.Date;

public class PersonMsg {
    private Long pmId;

    private Integer sendUserId;

    private String userName;

    private Date crtime;

    private Boolean pmType;

    private Integer recieveUserId;

    private String recieveUserName;

    private Date recieveTime;

    private Boolean status;

    private String pmContent;

    public Long getPmId() {
        return pmId;
    }

    public void setPmId(Long pmId) {
        this.pmId = pmId;
    }

    public Integer getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(Integer sendUserId) {
        this.sendUserId = sendUserId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public Date getCrtime() {
        return crtime;
    }

    public void setCrtime(Date crtime) {
        this.crtime = crtime;
    }

    public Boolean getPmType() {
        return pmType;
    }

    public void setPmType(Boolean pmType) {
        this.pmType = pmType;
    }

    public Integer getRecieveUserId() {
        return recieveUserId;
    }

    public void setRecieveUserId(Integer recieveUserId) {
        this.recieveUserId = recieveUserId;
    }

    public String getRecieveUserName() {
        return recieveUserName;
    }

    public void setRecieveUserName(String recieveUserName) {
        this.recieveUserName = recieveUserName == null ? null : recieveUserName.trim();
    }

    public Date getRecieveTime() {
        return recieveTime;
    }

    public void setRecieveTime(Date recieveTime) {
        this.recieveTime = recieveTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getPmContent() {
        return pmContent;
    }

    public void setPmContent(String pmContent) {
        this.pmContent = pmContent == null ? null : pmContent.trim();
    }
}