package cn.monster.service;

import cn.monster.domain.PageBean;
import cn.monster.domain.User;
import cn.monster.domain.UserLogin;

import java.util.List;
import java.util.Map;

public interface UserService {
    List<User> findAll();
    UserLogin findUserLogin(UserLogin userLogin);

    Boolean addUser(User user);

    Boolean delete(String id);

    User userSelect(String id);

    Boolean update(User user);

    Boolean delSelect(String[] uids);

    PageBean<User> findUserSelectPage(String currentPage, String rows, Map<String, String[]> parameterMap);
}
