package cn.monster.service;

import cn.monster.domain.User;
import cn.monster.domain.UserLogin;

import java.util.List;

public interface UserService {
    List<User> findAll();
    UserLogin findUserLogin(UserLogin userLogin);
}
