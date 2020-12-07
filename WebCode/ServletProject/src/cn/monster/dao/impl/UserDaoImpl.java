package cn.monster.dao.impl;

import cn.monster.dao.UserDao;
import cn.monster.domain.User;
import cn.monster.domain.UserLogin;
import cn.monster.util.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.*;

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
    public int findTotalCount(Map<String, String[]> parameterMap) {
        String sql = "select count(*) from user where 1 = 1";
        StringBuilder sqlString = new StringBuilder(sql);
        ArrayList<Object> paramsValue = new ArrayList<Object>();
        Set<String> strings = parameterMap.keySet();
        for (String key : strings) {
            if("currentPage".equals(key) || "rows".equals(key)) {
                continue;
            }
            if( !"".equals(parameterMap.get(key)[0])) {
                sqlString.append(" and " + key + " like ? ");
                paramsValue.add("%" + parameterMap.get(key)[0] + "%");
            }

        }
        return jdbcTemplate.queryForObject(sqlString.toString(), Integer.class, paramsValue.toArray());
    }

    @Override
    public List<User> findUserPageList(int start, int rows, Map<String, String[]> parameterMap) {
        String sql = "select * from user where 1 = 1";
        StringBuilder sqlString = new StringBuilder(sql);
        ArrayList<Object> paramsValue = new ArrayList<Object>();
        Set<String> strings = parameterMap.keySet();
        for (String key : strings) {
            if("currentPage".equals(key) || "rows".equals(key)) {
                continue;
            }
            if( !"".equals(parameterMap.get(key)[0])) {
                sqlString.append(" and " + key + " like ? ");
                paramsValue.add("%" + parameterMap.get(key)[0] + "%");
            }
        }
        sqlString.append(" limit ?, ?");
        paramsValue.add(start);
        paramsValue.add(rows);
        return jdbcTemplate.query(sqlString.toString(), new BeanPropertyRowMapper<User>(User.class), paramsValue.toArray());
    }
}
