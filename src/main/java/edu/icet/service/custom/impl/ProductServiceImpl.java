package edu.icet.service.custom.impl;

import edu.icet.model.Product;
import edu.icet.service.custom.ProductService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Override
    public List<Product> getProduct() {

        // ---> i
        Product product1 = new Product();
        product1.setName("Orange");
        product1.setDescription("Delicious");
        product1.setPrice(100.0);

        // ---> ii
        Product product2 = new Product("Apple","Good",150.0);

        // ---> iii
        Product product3 = Product.builder().name("Mango").description("Good").price(250.0).build();

        return Arrays.asList(product1,product2,product3);

    }
}
