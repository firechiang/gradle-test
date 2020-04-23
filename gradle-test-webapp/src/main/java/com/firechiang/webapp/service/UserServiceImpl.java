package com.firechiang.webapp.service;

import com.firechiang.api.UserService;
import com.firechiang.model.User;

/**
 * 用户服务的实现
 * @author JIANG
 * @version 1.0
 * @date 2020/4/17
 * @deprecated com.firechiang.webapp
 */
public class UserServiceImpl implements UserService {

    @Override
    public void save(User user) {
        User u = new User();
        u.setName("maomoa");
        u.setAge(12);
        System.err.println("保存了User="+u.toString());
    }
}
