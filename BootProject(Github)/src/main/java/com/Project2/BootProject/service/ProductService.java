package com.Project2.BootProject.service;

import com.Project2.BootProject.model.Product;
import com.Project2.BootProject.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(101, "iphone",50000),
//            new Product(102,"Camera",70000),
//            new Product(103,"Samsung",55000)));

    public List<Product> getProducts(){
//        return products;
        return repo.findAll();

    }


    public Product getProductById(int prodId) {
//        return products.stream()
//                .filter(p -> p.getProdId() == prodId)
//                .findFirst().orElse(new Product(100, "No Item",0));

        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod){
//        products.add(prod);
        repo.save(prod);
    }


    public void updateProduct(Product prod) {
//        int index =0;
//        for(int i =0; i< products.size() ; i++){
//            if(products.get(i).getProdId() == prod.getProdId()){
//                index =i;
//            }
//        }
//        products.set(index, prod);

        repo.save(prod);
    }

    public void deleteProduct(int prodId) {
//        int index =0;
//        for(int i =0; i< products.size() ; i++){
//            if(products.get(i).getProdId() == prodId){
//                index =i;
//            }
//        }
//        products.remove(index);

        repo.deleteById(prodId);
    }
}
