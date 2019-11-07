import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

class Test{
    static Connection conn;
    public static void main(String args[]){
        String driver = "com.mysql.jdbc.Driver";//驱动程序名
        String url = "jdbc:mysql://127.0.0.1:3306/hello1";	// URL指向要访问的数据库名Test
        String user = "root";// MySQL配置时的用户名
        String password = "1227";// Java连接MySQL配置时的密码
        try {         // 加载驱动程序
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);// 连续数据库
            System.out.println("Succeeded connecting to the Database!");
            Statement stmt=conn.createStatement();
            String sql1="select * from student";
            ResultSet rs=stmt.executeQuery(sql1);   //结果集
            ResultSetMetaData rsmd=rs.getMetaData();
            while(rs.next()){       //根据结果一起体会会比较好理解
                System.out.print(rsmd.getColumnName(1)+"  ");  //取得列名
                System.out.println(rsmd.getColumnName(2));
                System.out.print(rs.getString(1)+"  ");       // 第一列中的的第一个数据
                System.out.println(rs.getString(2));
            }
        }
        catch(Exception e){
            System.out.println("Succeeded connecting Not to the Database!");
            e.printStackTrace();
        }
        finally{
            try{
                if(conn!=null){
                    conn.close();
                }
            }
            catch(SQLException e){
                e.printStackTrace();
            }
        }
    }

}
