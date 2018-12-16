import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUTILS {
    static{
        //加载JDBC驱动程序         
        try{
            String diverName="com.mysql.cj.jdbc.Driver";
            Class.forName(diverName);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static Connection getConnection(){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/red6"+"? serverTimezone=GMT%2B8&useSSL=false&characterEncoding=utf-8","root","");

        }catch (Exception e){ e.printStackTrace(); }
        return con;}
}
