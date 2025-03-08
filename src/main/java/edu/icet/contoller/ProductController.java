package edu.icet.contoller;

import edu.icet.service.custom.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class ProductController {

    final ProductService service;
}
