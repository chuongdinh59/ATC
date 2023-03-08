package com.athttt.converter;

import com.athttt.dto.ProductDTO;
import com.athttt.dto.RoleDTO;
import com.athttt.entity.RoleEntity;
import org.modelmapper.ModelMapper;

import com.athttt.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter {
	@Autowired
	private ModelMapper modelMapper;

	public ProductDTO convertToDto(ProductEntity entity) {
		ProductDTO result = modelMapper.map(entity, ProductDTO.class);
		return result;
	}

	public ProductEntity convertToEntity(ProductEntity dto) {
		ProductEntity result = modelMapper.map(dto, ProductEntity.class);
		return result;
	}

}
