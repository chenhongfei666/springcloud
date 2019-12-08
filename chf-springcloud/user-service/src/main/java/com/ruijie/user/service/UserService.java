package com.ruijie.user.service;

import com.ruijie.user.mapper.UserMapper;
import com.ruijie.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryById(Long id) {
     /*   try {
            Thread.sleep(3000);

        } catch (Exception e) {
            e.printStackTrace();
        }*/
        return userMapper.selectByPrimaryKey(id);

    }
}
