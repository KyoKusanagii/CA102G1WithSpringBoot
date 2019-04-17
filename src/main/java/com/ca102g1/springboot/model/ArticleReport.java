package com.ca102g1.springboot.model;

public class ArticleReport {
    private String articleReportNo;

    private String memNo;

    private String empNo;

    private String artiNo;

    private Short reportStatus;

    private String reportReasons;

    private String reportDescription;

    public String getArticleReportNo() {
        return articleReportNo;
    }

    public void setArticleReportNo(String articleReportNo) {
        this.articleReportNo = articleReportNo == null ? null : articleReportNo.trim();
    }

    public String getMemNo() {
        return memNo;
    }

    public void setMemNo(String memNo) {
        this.memNo = memNo == null ? null : memNo.trim();
    }

    public String getEmpNo() {
        return empNo;
    }

    public void setEmpNo(String empNo) {
        this.empNo = empNo == null ? null : empNo.trim();
    }

    public String getArtiNo() {
        return artiNo;
    }

    public void setArtiNo(String artiNo) {
        this.artiNo = artiNo == null ? null : artiNo.trim();
    }

    public Short getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(Short reportStatus) {
        this.reportStatus = reportStatus;
    }

    public String getReportReasons() {
        return reportReasons;
    }

    public void setReportReasons(String reportReasons) {
        this.reportReasons = reportReasons == null ? null : reportReasons.trim();
    }

    public String getReportDescription() {
        return reportDescription;
    }

    public void setReportDescription(String reportDescription) {
        this.reportDescription = reportDescription == null ? null : reportDescription.trim();
    }
}