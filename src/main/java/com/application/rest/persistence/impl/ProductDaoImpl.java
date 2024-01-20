package com.application.rest.persistence.impl;

import com.application.rest.entities.Product;
import com.application.rest.persistence.IProductDao;
import com.application.rest.respository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Component
public class ProductDaoImpl implements IProductDao {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return  productRepository.findById(id);
    }

    @Override
    public List<Product> findProductByPriceInRange(BigDecimal minPrice, BigDecimal maxPrice) {
        return productRepository.findProductByPriceInRange(minPrice,maxPrice);
    }


    @Override
    public void save(Product product) {
    productRepository.save(product);
    }

    @Override
    public void deleteById(Long id) {
    productRepository.findById(id);
    }


}
