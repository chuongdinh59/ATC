package com.athttt.repository;

import java.util.List;
import java.util.Map;

import com.athttt.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

}
