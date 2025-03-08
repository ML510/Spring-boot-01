package edu.icet.contoller;

import edu.icet.model.Product;
import edu.icet.service.custom.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class ProductController {

    // ********** Constructor Dependency Injection ********
    final ProductService service;

    @GetMapping("/product/all")
    List<Product> getProduct(){
        return service.getProduct();
    }
}
