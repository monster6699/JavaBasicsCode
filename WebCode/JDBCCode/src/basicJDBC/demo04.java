package basicJDBC;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class demo04 {
    public static void main(String[] args) {
        List<AdminRole> adminRoleList = getAdminRoleList();
        System.out.println(adminRoleList);
    }

    public static List<AdminRole> getAdminRoleList() {
        ArrayList<AdminRole> adminRolesList = new ArrayList<>();
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://39.106.78.168:3306/monster?characterEncoding=utf-8", "root", "1241340047chen");
             Statement statement = conn.createStatement()) {
            String sql = "select * from admin_role";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String remark = resultSet.getString(3);
                int status = resultSet.getInt("status");
                Date create_time = resultSet.getDate("create_time");
                Date update_time = resultSet.getDate("update_time");

                AdminRole adminRole = new AdminRole();
                adminRole.setId(id);
                adminRole.setName(name);
                adminRole.setRemark(remark);
                adminRole.setStatus(status);
                adminRole.setCreate_time(create_time);
                adminRole.setUpdate_time(update_time);
                adminRolesList.add(adminRole);
            }
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adminRolesList;
    }


}
