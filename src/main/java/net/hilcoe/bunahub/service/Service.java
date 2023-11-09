package net.hilcoe.bunahub.service;

@org.springframework.stereotype.Service
public class Service {
    private static DBService dbService;

    public Service(DBService dbService) {
        this.dbService = dbService;
    }

    public void addPurchaser(String email, String pwd, String companyName, String type, byte[] businessLicense){
        dbService.addPurchaser(email,pwd,companyName,type,businessLicense);
    }
    public void addDistributor(String email, String pwd, String companyName, String location, byte[] businessLicense){
        dbService.addPurchaser(email, pwd, companyName, location, businessLicense);
    }
    public void addProduct(int distributorId, String brand, String flavor, String size, String desc, byte[] image, double price){
        dbService.addProduct(distributorId, brand, flavor, size, desc, image, price);
    }
    public void addSingleCart(int productId, int cartId, double amount, double unitPrice, double totalPrice){
        dbService.addSingleCart(productId, cartId, amount, unitPrice, totalPrice);
    }
    public void addCart(int purchaserId,boolean active, double totalPrice){
        dbService.addCart(purchaserId, active, totalPrice);
    }
}
