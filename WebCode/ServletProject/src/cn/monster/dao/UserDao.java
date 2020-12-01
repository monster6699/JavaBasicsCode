package cn.monster.dao;

import cn.monster.dao.impl.UserDaoImpl;
import cn.monster.domain.User;
import cn.monster.domain.UserLogin;

import java.util.List;

public interface UserDao {
    List<User> findAll();
    UserLogin findUserLogin(UserLogin userLogin);
}
