package main;

import obj.Product;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    public List<Product> list (){

        return null;
    }

    public int addProduct (Product product) {

        return product.getId();
    }

}
