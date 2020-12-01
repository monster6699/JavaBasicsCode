package cn.monster.dao.impl;

import cn.monster.dao.UserDao;
import cn.monster.domain.User;
import cn.monster.domain.UserLogin;
import cn.monster.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class UserDaoImpl implements UserDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
    @Override
    public List<User> findAll() {
        String sql = "select * from user";
        List<User> users = jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
        return users;
    }

    @Override
    public UserLogin findUserLogin(UserLogin userLogin) {
        String sql = "select * from test where username=? and password=?";
        UserLogin user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(UserLogin.class), userLogin.getUsername(), userLogin.getPassword());
        return user;
    }
}
