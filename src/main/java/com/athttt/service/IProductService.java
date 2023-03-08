package com.athttt.service;

import com.athttt.dto.ProductDTO;

import java.util.List;
import java.util.Map;

public interface IProductService {

    List<ProductDTO> getProducts (Map<String, Object> searchMap, Integer page);
}
