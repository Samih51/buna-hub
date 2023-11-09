package net.hilcoe.bunahub.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddProductDTO {
    private int distributorId;
    private String brand,flavor,  size,  desc;
    private byte[] image;
    private double price;

    public AddProductDTO(@JsonProperty("distributorId")int distributorId, @JsonProperty("brand")String brand,
                         @JsonProperty("flavor")String flavor, @JsonProperty("size") String size,
                         @JsonProperty("desc")String desc,@JsonProperty("image") byte[] image,@JsonProperty("price") double price) {
        this.distributorId = distributorId;
        this.brand = brand;
        this.flavor = flavor;
        this.size = size;
        this.desc = desc;
        this.image = image;
        this.price = price;
    }

    public int getDistributorId() {
        return distributorId;
    }

    public void setDistributorId(int distributorId) {
        this.distributorId = distributorId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
