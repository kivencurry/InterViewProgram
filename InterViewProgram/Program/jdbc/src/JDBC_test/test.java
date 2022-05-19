package JDBC_test;
import UTILIES.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class test {

    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        try {
            //获取连接
            conn= DBUtils.getConnection();
            String sql="select ename from emp where ename like ?";
            ps=conn.prepareStatement(sql);//编译sql语句
            ps.setString(1,"_A%");
            rs=ps.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("ename"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtils.close(conn,ps,rs);
        }
    }
}