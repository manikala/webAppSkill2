package main;

import obj.Product;

import java.util.ArrayList;
import java.util.List;

public class Storage {

    private static ArrayList<Product> products = new ArrayList<>();

    public static List<Product> getProducts (){
        return  products;
    }

    public static int addProduct(Product product) {
        int id = products.size() + 1;
        product.setId(id);
        products.add(product);
        return id;
    }

}
