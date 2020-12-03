package cn.monster.service;

import cn.monster.domain.User;
import cn.monster.domain.UserLogin;

import java.util.List;

public interface UserService {
    List<User> findAll();
    UserLogin findUserLogin(UserLogin userLogin);

    Boolean addUser(User user);

    Boolean delete(String id);

    User userSelect(String id);

    Boolean update(User user);
}
