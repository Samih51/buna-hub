package net.hilcoe.bunahub.contoller;

import net.hilcoe.bunahub.dtos.*;
import net.hilcoe.bunahub.service.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    private static Service service;

    public Controller(Service service) {
        this.service=service;
    }

    @PostMapping("/addPurchaser")
    public void addPurchaser(@RequestBody AddPurchaserDTO dto){
        service.addPurchaser(dto.getEmail(), dto.getPwd(), dto.getCompanyName(), dto.getType(), dto.getBusinessLicense());
    }

    @PostMapping("/addDistributor")
    public void addDistributor(@RequestBody AddDistributorDTO dto){
        service.addDistributor(dto.getEmail(), dto.getPwd(), dto.getCompanyName(), dto.getLocation(), dto.getBusinessLicense());
    }

    @PostMapping("/addProduct")
    public void addProduct(@RequestBody AddProductDTO dto){
        service.addProduct(dto.getDistributorId(), dto.getBrand(), dto.getFlavor(), dto.getSize(), dto.getDesc(), dto.getImage(), dto.getPrice());
    }

    @PostMapping("/addSingleCart")
    public void addSingleCart(@RequestBody AddSingleCartDTO dto){
        service.addSingleCart(dto.getProductId(),dto.getCartId(), dto.getAmount(), dto.getUnitPrice(), dto.getTotalPrice());
    }

    @PostMapping("/addCart")
    public void addCart(@RequestBody AddCartDTO dto){
        service.addCart(dto.getPurchaserId(),dto.isActive(),dto.getTotalPrice());
    }
}
