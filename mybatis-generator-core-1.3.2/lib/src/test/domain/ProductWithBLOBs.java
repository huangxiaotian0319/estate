package test.domain;

public class ProductWithBLOBs extends Product {
    private String detail;

    private String logisticTerms;

    private String productcrtime;

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    public String getLogisticTerms() {
        return logisticTerms;
    }

    public void setLogisticTerms(String logisticTerms) {
        this.logisticTerms = logisticTerms == null ? null : logisticTerms.trim();
    }

    public String getProductcrtime() {
        return productcrtime;
    }

    public void setProductcrtime(String productcrtime) {
        this.productcrtime = productcrtime == null ? null : productcrtime.trim();
    }
}