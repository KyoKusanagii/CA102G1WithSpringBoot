package com.ca102g1.springboot.model;

public class ItemReport {
    private String itemReportNo;

    private String memNo;

    private String empNo;

    private String itemNo;

    private String reportReasons;

    private String reportDescription;

    private Short reportStatus;

    private byte[] reportPic;

    public String getItemReportNo() {
        return itemReportNo;
    }

    public void setItemReportNo(String itemReportNo) {
        this.itemReportNo = itemReportNo == null ? null : itemReportNo.trim();
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

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo == null ? null : itemNo.trim();
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

    public byte[] getReportPic() {
        return reportPic;
    }

    public void setReportPic(byte[] reportPic) {
        this.reportPic = reportPic;
    }
}