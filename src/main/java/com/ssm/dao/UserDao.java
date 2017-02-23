package com.ssm.dao;

import com.ssm.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * Created by Tong on 2017/2/22.
 */
@Repository
public interface UserDao {
    User selectById(Integer id);
    int insert(User user);
}
