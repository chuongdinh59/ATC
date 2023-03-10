package com.athttt.service.impl;

import com.athttt.converter.ProductConverter;
import com.athttt.dto.ProductDTO;
import com.athttt.entity.ProductEntity;
import com.athttt.repository.ProductRepository;
import com.athttt.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
        Pageable pageable = PageRequest.of(page - 1, 9);
        Page<ProductEntity> productPage = productRepository.findAll(pageable);
        List<ProductEntity> productEntityList = productPage.getContent();
        List<ProductDTO> productDTOList = new ArrayList<>();
        if(productEntityList.size() > 0){
            for ( ProductEntity productEntity : productEntityList) {
                productDTOList.add(productConverter.convertToDto(productEntity));
            }
        }
        return productDTOList;
    }

    @Override
    public Long count() {
        return productRepository.count();
    }


    public static void main(String[] args) {
        ProductService s = new ProductService();
        s.getProducts(null,1);
    }
}
