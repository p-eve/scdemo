package me.badman.mapper;

import me.badman.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * 添加用户
     * @param user
     * @return
     */
    public int addUser(User user);
}
