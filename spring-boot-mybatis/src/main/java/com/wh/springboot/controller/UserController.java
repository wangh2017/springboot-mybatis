package com.wh.springboot.controller;



import com.wh.springboot.bean.UserModel;
import com.wh.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;


    @GetMapping("/emp/{id}")
    public UserModel getEmp(@PathVariable("id") Integer id){
       return userMapper.getUserById(id);
    }

    @GetMapping("/emp")
    public void getInsert(UserModel userModel){
        userMapper.insertUser(userModel);
    }
}
