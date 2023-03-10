package com.athttt.repository;

import java.util.List;
import java.util.Map;

import com.athttt.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProductRepository extends JpaRepository<ProductEntity, Long> {

//    @Query("SELECT PE FROM ProductEntity PE LIMIT ?2 OFFSET ?1 ")
//
//
//    public List<ProductEntity> getProducts ( int start,  int pageSize);

    Page<ProductEntity> findAll(Pageable pageable);
}
