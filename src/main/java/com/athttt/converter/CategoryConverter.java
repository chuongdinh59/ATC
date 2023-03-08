package com.athttt.converter;

import com.athttt.dto.CategoryDTO;

import org.modelmapper.ModelMapper;

import com.athttt.entity.CategoryEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CategoryConverter {
	@Autowired
	private ModelMapper modelMapper;

	public CategoryDTO convertToDto(CategoryEntity entity) {
		CategoryDTO result = modelMapper.map(entity, CategoryDTO.class);
		return result;
	}

	public CategoryEntity convertToEntity(CategoryDTO dto) {
		CategoryEntity result = modelMapper.map(dto, CategoryEntity.class);
		return result;
	}

}