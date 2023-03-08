package com.athttt.service.impl;

import com.athttt.converter.ProductConverter;
import com.athttt.dto.ProductDTO;
import com.athttt.entity.ProductEntity;
import com.athttt.repository.ProductRepository;
import com.athttt.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
@Service
public class ProductService implements IProductService {
    @Autowired
    ProductRepository productRepository;

    @Autowired
    ProductConverter productConverter;

    @Override
    public List<ProductDTO> getProducts(Map<String, Object> searchMap, Integer page) {

        List<ProductEntity> productEntityList = productRepository.findAll();
        List<ProductDTO> productDTOList = new ArrayList<>();
        if(productEntityList.size() > 0){
            for ( ProductEntity productEntity : productEntityList) {
                productDTOList.add(productConverter.convertToDto(productEntity));
            }
        }

        return productDTOList;
    }

    public static void main(String[] args) {
        ProductService s = new ProductService();
        s.getProducts(null,1);
    }
}
