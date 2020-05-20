package com.wh.springboot.mapper;


import com.wh.springboot.bean.UserModel;

//指定这是一个操作数据库的mapper
//@Mapper
public interface UserMapper {

    public UserModel getUserById(Integer id);

    public void insertUser(UserModel userModel);
}
