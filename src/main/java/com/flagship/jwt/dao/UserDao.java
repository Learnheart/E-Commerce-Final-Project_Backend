package com.flagship.jwt.dao;

import com.flagship.jwt.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDao extends CrudRepository<User, String> {
}
