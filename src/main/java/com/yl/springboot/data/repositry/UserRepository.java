package com.yl.springboot.data.repositry;

import com.yl.springboot.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}