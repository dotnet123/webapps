package cn.le55.dsj.service;
import org.jfaster.mango.datasource.DriverManagerDataSource;
import org.jfaster.mango.operator.Mango;
import javax.sql.DataSource;

public class MangoFactory {

    public static Mango mango;

    static {
        String driverClassName = "com.mysql.jdbc.Driver";
       String url = "jdbc:mysql://192.168.153.129:3306/dsj";
        String username = "root"; // 这里请使用您自己的用户名
       String password = "123456"; // 这里请使用您自己的密码


        DataSource ds = new DriverManagerDataSource(driverClassName, url, username, password);
        mango = Mango.newInstance(ds); // 使用数据源初始化mango
    }


}

