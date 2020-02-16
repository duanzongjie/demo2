package com.example.demo.mapper;


import com.example.demo.domian.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {

    User login(User user);
}
