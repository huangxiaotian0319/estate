package test.domain;

import java.util.Date;

public class LeaveMsg {
    private Integer userId;

    private String userName;

    private Integer leavemesboardId;

    private Integer leavemessageId;

    private Integer leaveUserId;

    private String leaveUserName;

    private Date crtime;

    private Boolean isDel;

    private String content;

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

    public Integer getLeavemesboardId() {
        return leavemesboardId;
    }

    public void setLeavemesboardId(Integer leavemesboardId) {
        this.leavemesboardId = leavemesboardId;
    }

    public Integer getLeavemessageId() {
        return leavemessageId;
    }

    public void setLeavemessageId(Integer leavemessageId) {
        this.leavemessageId = leavemessageId;
    }

    public Integer getLeaveUserId() {
        return leaveUserId;
    }

    public void setLeaveUserId(Integer leaveUserId) {
        this.leaveUserId = leaveUserId;
    }

    public String getLeaveUserName() {
        return leaveUserName;
    }

    public void setLeaveUserName(String leaveUserName) {
        this.leaveUserName = leaveUserName == null ? null : leaveUserName.trim();
    }

    public Date getCrtime() {
        return crtime;
    }

    public void setCrtime(Date crtime) {
        this.crtime = crtime;
    }

    public Boolean getIsDel() {
        return isDel;
    }

    public void setIsDel(Boolean isDel) {
        this.isDel = isDel;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}