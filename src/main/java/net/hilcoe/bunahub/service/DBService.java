package net.hilcoe.bunahub.service;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    JdbcTemplate jdbcTemplate = new JdbcTemplate();

    public void addDistributor(String email, String pwd, String companyName, String location, byte[] businessLicense){
        String sql = "INSERT INTO Distributor VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql,email,pwd,companyName,location,businessLicense);
    }
    public void addPurchaser(String email, String pwd, String companyName, String type, byte[] businessLicense){
        String sql = "INSERT INTO Purchaser VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql,email,pwd,companyName,type,businessLicense);
    }
    public void addProduct(int distributorId, String brand, String flavor, String size, String desc, byte[] image, double price){
        String sql = "INSERT INTO Product VALUES(?,?,?,?,?,?,?)";
        jdbcTemplate.update(sql,distributorId,brand,flavor,size,desc,image,price);
    }

    public void addSingleCart(int productId, int cartId, double amount, double unitPrice, double totalPrice){
        String sql = "INSERT INTO SingleCart VALUES(?,?,?,?,?)";
        jdbcTemplate.update(sql,productId,cartId,amount,unitPrice,totalPrice);
    }

    public void addCart(int purchaserId,boolean active, double totalPrice){
        String sql = "INSERT INTO Cart VALUES(?,?,?)";
        jdbcTemplate.update(sql,purchaserId,active,totalPrice);
    }
}
