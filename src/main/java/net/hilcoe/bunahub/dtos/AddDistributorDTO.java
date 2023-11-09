package net.hilcoe.bunahub.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddDistributorDTO {
    private String email ,pwd, companyName, location;
    private byte[] businessLicense;

    public AddDistributorDTO(@JsonProperty("email")String email,@JsonProperty("pwd") String pwd,
                             @JsonProperty("companyName")String companyName, @JsonProperty("location")String location,
                             @JsonProperty("businessLicense") byte[] businessLicense) {
        this.email = email;
        this.pwd = pwd;
        this.companyName = companyName;
        this.location = location;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public byte[] getBusinessLicense() {
        return businessLicense;
    }

    public void setBusinessLicense(byte[] businessLicense) {
        this.businessLicense = businessLicense;
    }
}
