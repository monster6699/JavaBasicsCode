package cn.monster.service.impl;

import cn.monster.dao.UserDao;
import cn.monster.dao.impl.UserDaoImpl;
import cn.monster.domain.User;
import cn.monster.domain.UserLogin;
import cn.monster.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();
    @Override
    public List<User> findAll() {
        try {
            return  userDao.findAll();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public UserLogin findUserLogin(UserLogin userLogin) {
        try {

            return userDao.findUserLogin(userLogin);
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Boolean addUser(User user) {
        return userDao.addUser(user);
    }

    @Override
    public Boolean delete(String id) {
        return userDao.delete(id);
    }

    @Override
    public User userSelect(String id) {
        return userDao.select(id);
    }

    @Override
    public Boolean update(User user) {
        return userDao.update(user);
    }
}
