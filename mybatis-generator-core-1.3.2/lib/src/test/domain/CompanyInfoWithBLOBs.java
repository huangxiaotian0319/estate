package test.domain;

public class CompanyInfoWithBLOBs extends CompanyInfo {
    private String companyBrief;

    private String tradeterms;

    public String getCompanyBrief() {
        return companyBrief;
    }

    public void setCompanyBrief(String companyBrief) {
        this.companyBrief = companyBrief == null ? null : companyBrief.trim();
    }

    public String getTradeterms() {
        return tradeterms;
    }

    public void setTradeterms(String tradeterms) {
        this.tradeterms = tradeterms == null ? null : tradeterms.trim();
    }
}