package me.badman.service;

import me.badman.entity.User;

public interface UserService {

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser(User user);
}
