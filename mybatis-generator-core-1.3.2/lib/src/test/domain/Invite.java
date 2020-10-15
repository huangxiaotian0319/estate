package test.domain;

import java.util.Date;

public class Invite {
    private Integer icId;

    private Integer inviteUserId;

    private String inviteUserName;

    private Integer recieveUserId;

    private String recieveUserName;

    private String inviteCode;

    private Boolean isUsed;

    private Boolean isAdmin;

    private String type;

    private Boolean isReceived;

    private String receiverAcount;

    private Date ctime;

    public Integer getIcId() {
        return icId;
    }

    public void setIcId(Integer icId) {
        this.icId = icId;
    }

    public Integer getInviteUserId() {
        return inviteUserId;
    }

    public void setInviteUserId(Integer inviteUserId) {
        this.inviteUserId = inviteUserId;
    }

    public String getInviteUserName() {
        return inviteUserName;
    }

    public void setInviteUserName(String inviteUserName) {
        this.inviteUserName = inviteUserName == null ? null : inviteUserName.trim();
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

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public Boolean getIsUsed() {
        return isUsed;
    }

    public void setIsUsed(Boolean isUsed) {
        this.isUsed = isUsed;
    }

    public Boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(Boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Boolean getIsReceived() {
        return isReceived;
    }

    public void setIsReceived(Boolean isReceived) {
        this.isReceived = isReceived;
    }

    public String getReceiverAcount() {
        return receiverAcount;
    }

    public void setReceiverAcount(String receiverAcount) {
        this.receiverAcount = receiverAcount == null ? null : receiverAcount.trim();
    }

    public Date getCtime() {
        return ctime;
    }

    public void setCtime(Date ctime) {
        this.ctime = ctime;
    }
}