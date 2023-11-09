package net.hilcoe.bunahub.dtos;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AddCartDTO {
    private int purchaserId;
    private boolean active;
    private double totalPrice;

    @JsonCreator
    public AddCartDTO(@JsonProperty("purchaserId") int purchaserId,@JsonProperty("active") boolean active,@JsonProperty("totalPrice") double totalPrice) {
        this.purchaserId = purchaserId;
        this.active = active;
        this.totalPrice = totalPrice;
    }

    public int getPurchaserId() {
        return purchaserId;
    }

    public void setPurchaserId(int purchaserId) {
        this.purchaserId = purchaserId;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
