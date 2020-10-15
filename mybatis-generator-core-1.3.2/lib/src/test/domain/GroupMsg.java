package test.domain;

import java.util.Date;

public class GroupMsg {
    private String groupName;

    private Long gmId;

    private Date crtime;

    private Integer sendUserId;

    private String sendUserName;

    private String gmContent;

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Long getGmId() {
        return gmId;
    }

    public void setGmId(Long gmId) {
        this.gmId = gmId;
    }

    public Date getCrtime() {
        return crtime;
    }

    public void setCrtime(Date crtime) {
        this.crtime = crtime;
    }

    public Integer getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(Integer sendUserId) {
        this.sendUserId = sendUserId;
    }

    public String getSendUserName() {
        return sendUserName;
    }

    public void setSendUserName(String sendUserName) {
        this.sendUserName = sendUserName == null ? null : sendUserName.trim();
    }

    public String getGmContent() {
        return gmContent;
    }

    public void setGmContent(String gmContent) {
        this.gmContent = gmContent == null ? null : gmContent.trim();
    }
}