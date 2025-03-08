package edu.icet.service.custom;

import edu.icet.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

public interface ProductService {

    List<Product> getProduct();
}
