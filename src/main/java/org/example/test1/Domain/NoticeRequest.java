package org.example.test1.Domain;

// NoticeRequest.java - 完整请求对象
public class NoticeRequest {
    private String signType;
    private String uniqueNo;
    private String nonceStr;
    private String sign;
    private String mchId;
    private String version;
    private BizContent bizContent;



    public String getSignType() { return signType; }
    public void setSignType(String signType) { this.signType = signType; }

    public String getUniqueNo() { return uniqueNo; }
    public void setUniqueNo(String uniqueNo) { this.uniqueNo = uniqueNo; }

    public String getNonceStr() { return nonceStr; }
    public void setNonceStr(String nonceStr) { this.nonceStr = nonceStr; }

    public String getSign() { return sign; }
    public void setSign(String sign) { this.sign = sign; }

    public String getMchId() { return mchId; }
    public void setMchId(String mchId) { this.mchId = mchId; }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public BizContent getBizContent() { return bizContent; }
    public void setBizContent(BizContent bizContent) { this.bizContent = bizContent; }

    @Override
    public String toString() {
        return "NoticeRequest{" +
                "signType='" + signType + '\'' +
                ", uniqueNo='" + uniqueNo + '\'' +
                ", nonceStr='" + nonceStr + '\'' +
                ", sign='" + sign + '\'' +
                ", mchId='" + mchId + '\'' +
                ", version='" + version + '\'' +
                ", bizContent=" + bizContent +
                '}';
    }
}