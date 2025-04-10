package io.github.premwadhwani24.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//REST= Representational State Transfer (use for transfer data)
//JSON=JavaScript Object Notation
@RestController
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    //CREATE - POST
    @PostMapping("/products/add")
    public Product addProduct(@RequestBody Product product) {
        productService.addProduct(product);
        return product;
    }

    //READ - GET
    @GetMapping("/products")
    public List<Product> getProductList() {
        return productService.getProductList();
    }

    @GetMapping("product/{id}")
    public Product getProduct(@PathVariable long id) {
        return productService.getProduct(id);

    }

    //UPDATE - PUT
    @PutMapping("/products")
    public Product updatePrice(Product product) {
        return productService.updatePrice(product);
    }

    //DELETE - DELETE
    @DeleteMapping("/products")
    public void deleteProduct(@RequestBody Product product) {
        productService.deleteProduct(product);
    }


    //REQUEST - HTTP METHOD & URL

    //RESPONSE - HTTP STATUS & RESPONSE BODY


}
