package UTILIES;

/**
 * @author cid
 * @create 2022-05-14-21:41
 */

import java.sql.*;

public class DBUtils {
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//注册驱动
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
    /*
     * 获取数据库连接对象，
     * @return连接对象
     * */
    public static Connection getConnection() throws SQLException {
        String url="jdbc:mysql://127.0.0.1:3306/zhang?useUnicode=true&characterEncoding=utf-8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&serverTimezone=Asia/Shanghai";

        Connection conn=DriverManager.getConnection(url,"root","Zz@2458247611");

        return conn;
    }
    /*
     * 关闭资源

     */
    public static void close(Connection conn, Statement ps, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}