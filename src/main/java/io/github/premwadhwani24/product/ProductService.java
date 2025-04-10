package io.github.premwadhwani24.product;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList;

    public ProductService() {
        productList = new LinkedList<>();
    }

    //CRUD - CREATE ,READ,UPDATE DELETE
    //CREATE
    public Product addProduct(Product product){
        productList.add(product);
        return product;
    }
    //READ

    //UPDATE

    //DELETE
}
