package cn.monster.service.impl;

import cn.monster.dao.UserDao;
import cn.monster.dao.impl.UserDaoImpl;
import cn.monster.domain.User;
import cn.monster.domain.UserLogin;
import cn.monster.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> findAll() {
        try {
            UserDao userDao = new UserDaoImpl();
            List<User> users = userDao.findAll();
            return users;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public UserLogin findUserLogin(UserLogin userLogin) {
        try {
            UserDao userDao = new UserDaoImpl();
            UserLogin user = userDao.findUserLogin(userLogin);
            return user;
        } catch (Exception e) {
            return null;
        }
    }
}
