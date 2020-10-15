package test.domain;

import java.util.Date;

public class Tag {
    private Integer userId;

    private String userName;

    private Date crtime;

    private String tagCategory;

    private Integer tagDepth;

    private String tagName;

    private String spareField;

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

    public Date getCrtime() {
        return crtime;
    }

    public void setCrtime(Date crtime) {
        this.crtime = crtime;
    }

    public String getTagCategory() {
        return tagCategory;
    }

    public void setTagCategory(String tagCategory) {
        this.tagCategory = tagCategory == null ? null : tagCategory.trim();
    }

    public Integer getTagDepth() {
        return tagDepth;
    }

    public void setTagDepth(Integer tagDepth) {
        this.tagDepth = tagDepth;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public String getSpareField() {
        return spareField;
    }

    public void setSpareField(String spareField) {
        this.spareField = spareField == null ? null : spareField.trim();
    }
}