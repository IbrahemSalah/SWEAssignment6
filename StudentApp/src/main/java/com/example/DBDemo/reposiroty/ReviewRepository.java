package com.example.DBDemo.reposiroty;

import com.example.DBDemo.entity.Review;
import org.springframework.data.repository.ListCrudRepository;

public interface ReviewRepository extends ListCrudRepository<Review, Long> {

}
