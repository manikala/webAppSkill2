package main;

import obj.Product;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @RequestMapping(value = "/products/", method = RequestMethod.GET)
    public List<Product> list (){

        return Storage.getProducts();
    }

    @RequestMapping(value = "/products/", method = RequestMethod.POST)
    public int addProduct (Product product) {
        //Storage.addProduct(product);
        return Storage.addProduct(product);
    }

}
