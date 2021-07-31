package me.badman.controller.service.impl;

import io.seata.spring.annotation.GlobalTransactional;
import me.badman.controller.service.UserService;
import me.badman.feign.IUserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private IUserFeign iUserFeign;

    /**
     * 添加用户
     * @param name
     * @param age
     * @return
     */
    @GlobalTransactional
    public String addUser(String name,Integer age){
        String res=this.iUserFeign.addUser(name,age);
        if(name.equals("vincent"))
        {
            throw new RuntimeException("账户或库存不足,执行回滚");
        }
        return res;
    }
}
