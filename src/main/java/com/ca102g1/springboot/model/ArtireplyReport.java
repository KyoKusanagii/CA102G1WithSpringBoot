package com.ca102g1.springboot.model;

public class ArtireplyReport {
    private String artireplyReportNo;

    private String memNo;

    private String empNo;

    private String artiNo;

    private Long repNo;

    private String reportReasons;

    private String reportDescription;

    private Short reportStatus;

    public String getArtireplyReportNo() {
        return artireplyReportNo;
    }

    public void setArtireplyReportNo(String artireplyReportNo) {
        this.artireplyReportNo = artireplyReportNo == null ? null : artireplyReportNo.trim();
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

    public Long getRepNo() {
        return repNo;
    }

    public void setRepNo(Long repNo) {
        this.repNo = repNo;
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

    public Short getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(Short reportStatus) {
        this.reportStatus = reportStatus;
    }
}