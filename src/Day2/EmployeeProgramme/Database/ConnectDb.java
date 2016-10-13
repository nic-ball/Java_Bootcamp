package Day2.EmployeeProgramme.Database;

import java.sql.Connection;
import java.sql.DriverManager;

import static java.lang.Class.forName;

/**
 * Created by nicholas.ball on 13/10/2016.
 */
public class ConnectDb {
    private Connection con;

    private String userName = "nic";
    private String password = "London2016";
    private String url = "jdbc:mysql://localhost:3306/javaweek?UseSSL=false";

    public ConnectDb() throws Exception {
        //get the driver
        Class.forName("com.mysql.jdbc.Driver");

        //connect to DB - javaweek
        con = DriverManager.getConnection(url,userName,password);
    }
    //get connection instance
    public Connection getCon() {
        return this.con;
    }
}
