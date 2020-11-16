package UntilJDBC;

import basicJDBC.AdminRole;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class demo01 {
    public static void main(String[] args) {
        List<AdminRole> adminRoleList = getAdminRoleList();
        System.out.println(adminRoleList);
    }

    public static List<AdminRole> getAdminRoleList() {
        ArrayList<AdminRole> adminRolesList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        connection = JDBCUntil.getConnection();
//        try {
//            connection = JDBCUntil.getConnection();
//            statement = connection.createStatement();
//            String sql = "select * from admin_role";
//            resultSet = statement.executeQuery(sql);
//            while (resultSet.next()) {
//                int id = resultSet.getInt("id");
//                String name = resultSet.getString("name");
//                String remark = resultSet.getString(3);
//                int status = resultSet.getInt("status");
//                Date create_time = resultSet.getDate("create_time");
//                Date update_time = resultSet.getDate("update_time");
//
//                AdminRole adminRole = new AdminRole();
//                adminRole.setId(id);
//                adminRole.setName(name);
//                adminRole.setRemark(remark);
//                adminRole.setStatus(status);
//                adminRole.setCreate_time(create_time);
//                adminRole.setUpdate_time(update_time);
//                adminRolesList.add(adminRole);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
        return adminRolesList;
    }
}
