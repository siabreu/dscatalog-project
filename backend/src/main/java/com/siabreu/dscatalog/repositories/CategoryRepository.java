package com.siabreu.dscatalog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.siabreu.dscatalog.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
