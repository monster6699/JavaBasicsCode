package cn.monster.dao.impl;

import cn.monster.dao.ProvinceDao;
import cn.monster.domain.Province;
import cn.monster.until.DruidUntil;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class ProvinceDaoImpl implements ProvinceDao {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(DruidUntil.getDataSource());
    @Override
    public List<Province> findProvinceAll() {
        String sql = "select * from province";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<Province>(Province.class));
    }
}
