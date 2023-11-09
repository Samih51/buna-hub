package net.hilcoe.bunahub.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddSingleCartDTO {
    private int productId, cartId;
    private double amount, unitPrice,  totalPrice;

    public AddSingleCartDTO(@JsonProperty("productId")int productId,@JsonProperty("cartId") int cartId,@JsonProperty("amount") double amount,
                            @JsonProperty("unitPrice")double unitPrice, @JsonProperty("totalPrice")double totalPrice) {
        this.productId = productId;
        this.cartId = cartId;
        this.amount = amount;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
