package com.ssm.service;

import com.ssm.dao.UserDao;
import com.ssm.pojo.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Tong on 2017/2/22.
 */
@Service("userService")
public class UserServiceImp implements UserService{
    @Resource
    UserDao userDao;

    public void insertUser(User user){
        userDao.insert(user);
    }
}
