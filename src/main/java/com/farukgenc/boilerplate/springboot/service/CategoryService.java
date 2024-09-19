package com.farukgenc.boilerplate.springboot.service;

import com.farukgenc.boilerplate.springboot.model.Category;
import com.farukgenc.boilerplate.springboot.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> getCategories(){
        return this.categoryRepository.findAll();
    }


    public Category getCategoryByName(String category){
        return this.categoryRepository.findFirstByCategoryContainingIgnoreCase(category);
    }

    public Category save(Category category){
        return this.categoryRepository.save(category);
    }
}
