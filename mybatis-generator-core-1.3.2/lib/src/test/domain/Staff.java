package test.domain;

import java.util.Date;

public class Staff {
    private Integer companyId;

    private String companyDomain;

    private Integer orgstaffId;

    private String staffName;

    private Boolean gender;

    private String birthday;

    private String contact;

    private String photo;

    private String position;

    private Date staffcrtime;

    private Integer orgId;

    private String orgName;

    private Integer fatherId;

    private Integer displayOrder;

    private Date orgcrtime;

    private String brief;

    public Integer getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Integer companyId) {
        this.companyId = companyId;
    }

    public String getCompanyDomain() {
        return companyDomain;
    }

    public void setCompanyDomain(String companyDomain) {
        this.companyDomain = companyDomain == null ? null : companyDomain.trim();
    }

    public Integer getOrgstaffId() {
        return orgstaffId;
    }

    public void setOrgstaffId(Integer orgstaffId) {
        this.orgstaffId = orgstaffId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Date getStaffcrtime() {
        return staffcrtime;
    }

    public void setStaffcrtime(Date staffcrtime) {
        this.staffcrtime = staffcrtime;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName == null ? null : orgName.trim();
    }

    public Integer getFatherId() {
        return fatherId;
    }

    public void setFatherId(Integer fatherId) {
        this.fatherId = fatherId;
    }

    public Integer getDisplayOrder() {
        return displayOrder;
    }

    public void setDisplayOrder(Integer displayOrder) {
        this.displayOrder = displayOrder;
    }

    public Date getOrgcrtime() {
        return orgcrtime;
    }

    public void setOrgcrtime(Date orgcrtime) {
        this.orgcrtime = orgcrtime;
    }

    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief == null ? null : brief.trim();
    }
}