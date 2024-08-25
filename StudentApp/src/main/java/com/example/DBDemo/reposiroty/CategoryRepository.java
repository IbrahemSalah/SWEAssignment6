package com.example.DBDemo.reposiroty;

import com.example.DBDemo.entity.Category;
import org.springframework.data.repository.ListCrudRepository;

public interface CategoryRepository extends ListCrudRepository<Category, Long> {
}
