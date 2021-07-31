package me.badman.service.impl;

import me.badman.entity.User;
import me.badman.mapper.UserMapper;
import me.badman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser(User user){
        return this.userMapper.addUser(user);
    }
}
