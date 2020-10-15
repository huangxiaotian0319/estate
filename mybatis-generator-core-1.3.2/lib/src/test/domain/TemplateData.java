package test.domain;

import java.util.Date;

public class TemplateData {
    private Integer companyId;

    private String companyDomain;

    private Date templateUsingTime;

    private Date crtime;

    private Short type;

    private String templateName;

    private String templateAlias;

    private String templateTitle;

    private String templateUrl;

    private Byte templateType;

    private Boolean iscache;

    private String remark;

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

    public Date getTemplateUsingTime() {
        return templateUsingTime;
    }

    public void setTemplateUsingTime(Date templateUsingTime) {
        this.templateUsingTime = templateUsingTime;
    }

    public Date getCrtime() {
        return crtime;
    }

    public void setCrtime(Date crtime) {
        this.crtime = crtime;
    }

    public Short getType() {
        return type;
    }

    public void setType(Short type) {
        this.type = type;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName == null ? null : templateName.trim();
    }

    public String getTemplateAlias() {
        return templateAlias;
    }

    public void setTemplateAlias(String templateAlias) {
        this.templateAlias = templateAlias == null ? null : templateAlias.trim();
    }

    public String getTemplateTitle() {
        return templateTitle;
    }

    public void setTemplateTitle(String templateTitle) {
        this.templateTitle = templateTitle == null ? null : templateTitle.trim();
    }

    public String getTemplateUrl() {
        return templateUrl;
    }

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl == null ? null : templateUrl.trim();
    }

    public Byte getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Byte templateType) {
        this.templateType = templateType;
    }

    public Boolean getIscache() {
        return iscache;
    }

    public void setIscache(Boolean iscache) {
        this.iscache = iscache;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}