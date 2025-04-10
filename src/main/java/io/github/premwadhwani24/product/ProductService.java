package io.github.premwadhwani24.product;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

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
    public List<Product> getProductList() {
        return productList;
    }
    // READ -Single product
    public Product getProduct(long id){
        return productList.stream()
                .filter(p -> p.getId() == id)
                .findFirst()
                .orElse(null);

             }
        }

    //UPDATE
    public Product updatePrice(Product product) {
        productList.stream()
                .filter(p ->
                        p.getID() == product.getId()
                )
                .findFirst()
                .ifPresent(p ->
                        p.setPrice(
                                product.getPrice()
                        )
                );
        return product;
    }


//DELETE
public boolean deleteProduct(Product product){
    productList.remove(product);
    return true;
}

