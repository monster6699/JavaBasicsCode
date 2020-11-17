package JDBCTemplateCode;

import DataSourceCode.DruidUntil;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;
import java.util.Map;

public class demo01 {
    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(DruidUntil.getDataSource());
        String updateSql = "update admin_role set remark = ? where id = ? ";
        int update = jdbcTemplate.update(updateSql, "人生苦短，我用Python333", 17);
        if (update > 0) {
            System.out.println("更新成功");
        } else {
            System.out.println("更新失败");
        }

        String sql = "select * from admin_role";
        List<Map<String, Object>> maps = jdbcTemplate.queryForList(sql);
        for (Map<String, Object> map : maps
        ) {
            System.out.println(map);
        }


    }
}
