package net.hilcoe.bunahub.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddPurchaserDTO {
    private String email ,pwd, companyName, type;
    private byte[] businessLicense;

    public AddPurchaserDTO(@JsonProperty("email")String email,@JsonProperty("pwd") String pwd,
                           @JsonProperty("companyName")String companyName, @JsonProperty("type") String type,
                           @JsonProperty("businessLicense") byte[] businessLicense) {
        this.email = email;
        this.pwd = pwd;
        this.companyName = companyName;
        this.type = type;
        this.businessLicense = businessLicense;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(byte[] businessLicense) {
        this.businessLicense = businessLicense;
    }
}
