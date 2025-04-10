package io.github.premwadhwani24.product;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//REST= Representational State Tranfer (use for transfer data)
//JSON=JavaScript Object Notation
@RestController
public class ProductController() {
    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
    this.productSerive=productService;
    }
    //CREATE - POST
    @PostConstruct("/products/add")
    public Product addProduct(@RequestBody Product product){
        productService.addProduct(product);
        return product;
    }

    //READ - GET

    //UPDATE - PUT

    //DELETE - DELETE

    //REQUEST - HTTP METHOD & URL

    //RESPONSE - HTTP STATUS & RESPONSE BODY



}
