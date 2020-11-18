package JDBCTemplateCode;

import DataSourceCode.DruidUntil;
import org.junit.Test;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class demo02 {
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(DruidUntil.getDataSource());
    /*
    1. 修改数据
    2. 添加一条记录
    3. 删除刚才添加的记录
    4. 查询id为1的记录，将其封装为Map集合
    5. 查询所有记录，将其封装为List
    6. 查询所有记录，将其封装为Emp对象的List集合
    7. 查询总记录数
     */

    //1. 修改数据
    @Test
    public void test01() {

        String sql = "update account set price = ? where id = ?";
        int update = jdbcTemplate.update(sql, 200, 1);
        if(update > 0) {
            System.out.println("更新成功");
        } else {
            System.out.println("更新失败");
        }

    }

    //2. 添加一条记录
    @Test
    public void test02() {
        String sql = "insert into account values (null, ?, ?)";
        int update = jdbcTemplate.update(sql, "wangwu", 3000);
        if(update > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }

    }
    //3. 删除刚才添加的记录
    @Test
    public void test03() {
        String sql = "delete from account where id = ?";
        int update = jdbcTemplate.update(sql, 3);
        if(update > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
    }

    //4. 查询id为1的记录，将其封装为Map集合
    @Test
    public void test04() {
        String sql = "select * from account where id = ?";
        Map<String, Object> stringObjectMap = jdbcTemplate.queryForMap(sql, 1);
        System.out.println(stringObjectMap);
    }

    //5.查询所有记录，将其封装为List
    @Test
    public void test05() {
        String sql = "select * from account";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        System.out.println(maps);
    }

    // 6. 询所有记录，将其封装为Emp对象的List集合
    @Test
    public void test06() {
        String sql = "select * from account";
        List<Emp> query = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Emp>(Emp.class));
        System.out.println(query);
    }

}
