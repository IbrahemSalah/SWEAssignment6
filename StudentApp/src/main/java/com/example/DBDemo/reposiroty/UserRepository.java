package com.example.DBDemo.reposiroty;

import com.example.DBDemo.entity.User;
import org.springframework.data.repository.ListCrudRepository;

public interface UserRepository extends ListCrudRepository<User, Long> {
}
