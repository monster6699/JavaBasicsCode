package cn.monster.dao;

import cn.monster.domain.User;
import cn.monster.domain.UserLogin;

import java.util.List;
import java.util.Map;

public interface UserDao {
    List<User> findAll();
    UserLogin findUserLogin(UserLogin userLogin);

    Boolean addUser(User user);

    Boolean delete(String id);

    User select(String id);

    Boolean update(User user);

    int findTotalCount(Map<String, String[]> parameterMap);

    List<User> findUserPageList(int start, int rows, Map<String, String[]> parameterMap);
}
