package org.example.test1.Domain;


public class BizContent {
    private String retailOrderNo;
    private String mchOrderNo;
    private String code;
    private String message;
    private String fgTransNo;

    public String getRetailOrderNo() {
        return retailOrderNo;
    }

    public void setRetailOrderNo(String retailOrderNo) {
        this.retailOrderNo = retailOrderNo;
    }



    public String getMchOrderNo() { return mchOrderNo; }
    public void setMchOrderNo(String mchOrderNo) { this.mchOrderNo = mchOrderNo; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getFgTransNo() {
        return fgTransNo;
    }

    public void setFgTransNo(String fgTransNo) {
        this.fgTransNo = fgTransNo;
    }

    @Override
    public String toString() {
        return "BizContent{" +
                "retailOrderNo='" + retailOrderNo + '\'' +
                ", mchOrderNo='" + mchOrderNo + '\'' +
                ", code='" + code + '\'' +
                ", message='" + message + '\'' +
                ", fgTransNo='" + fgTransNo + '\'' +
                '}';
    }
}