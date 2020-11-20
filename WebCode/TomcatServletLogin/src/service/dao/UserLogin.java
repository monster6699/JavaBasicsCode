package service.dao;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import service.domain.User;
import service.until.DruidUntil;

public class UserLogin {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(DruidUntil.getDataSource());

    public User login(User user) {
        String sql = "select * from test where username=? and password=?";
        System.out.println(sql);
        try {
            return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<>(User.class), user.getUsername(), user.getPassword());
        } catch (Exception e) {
            return null;
        }

    }
}
