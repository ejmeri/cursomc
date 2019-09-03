package com.ejmeri.cursosmc.resource;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejmeri.cursosmc.domain.Category;
import com.ejmeri.cursosmc.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<?> findById(@PathVariable Integer id) {
		Category category = this.categoryService.findbyId(id);
		return ResponseEntity.ok().body(category);
	}
	
	@GetMapping()
	public ResponseEntity<?> findAll() {
		List<Category> categories = this.categoryService.findAll();
		return ResponseEntity.ok(categories);
	}
}
