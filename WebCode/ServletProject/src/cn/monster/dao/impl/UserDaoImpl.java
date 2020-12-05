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

    @Override
    public Boolean addUser(User user) {
        String sql = "insert into user values(null, ?, ?, ?, ?, ?, ?)";
        System.out.println(user);
        int update = jdbcTemplate.update(sql, user.getName(), user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail());
        return update > 0 ? true : false;
    }

    @Override
    public Boolean delete(String id) {
        String sql = "delete from user where id = ?";
        int update = jdbcTemplate.update(sql, id);
        return update > 0 ? true : false;
    }

    @Override
    public User select(String id) {
        String sql = "select * from user where id = ?";
        User user = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), Integer.parseInt(id));
        return user;
    }

    @Override
    public Boolean update(User user) {
        String sql = "update user set name=?, gender=?, age=?, address=?, qq=?, email=? where id= ?";
        int update = jdbcTemplate.update(sql, user.getName(),user.getGender(), user.getAge(), user.getAddress(), user.getQq(), user.getEmail(), user.getId());
        System.out.println(update);
        return update > 0 ? true : false;
    }

    @Override
    public int findTotalCount() {
        String sql = "select count(*) from user";
        Integer integer = jdbcTemplate.queryForObject(sql, Integer.class);
        System.out.println(integer);
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }

    @Override
    public List<User> findUserPageList(int start, int rows) {
        String sql = "select * from user limit ?, ?";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class), start, rows);
    }
}
