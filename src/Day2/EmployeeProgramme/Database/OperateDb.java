package Day2.EmployeeProgramme.Database;

import Day2.EmployeeProgramme.Models.Employee;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by nicholas.ball on 13/10/2016.
 */
public class OperateDb {
    private Connection con;

    public OperateDb(Connection con) {
        this.con = con;
    }

    public void createTables() throws SQLException {
        Statement statement = con.createStatement();
        statement.executeUpdate("CREATE TABLE  employee ("
                + "id INTEGER NOT NULL AUTO_INCREMENT,"
                + "firstName VARCHAR (50) NOT NULL,"
                + "lastName VARCHAR(100) NOT NULL,"
                + "dob DATE NOT NULL,"
                + "hiredate DATE NOT NULL,"
                + "role VARCHAR(50) NOT NULL,"
                + "PRIMARY KEY (id))");
    }


    public List<Employee> query(String queryStrings) throws SQLException {
        Statement statement = con.createStatement();
        ResultSet rs;
        Employee temp;
        List<Employee> tempEmployees = new ArrayList<>();

        rs = statement.executeQuery(queryStrings);
        while (rs.next()) {
            temp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4).toLocalDate(),
                    rs.getDate(5).toLocalDate(), rs.getString(6));
            tempEmployees.add(temp);
        }
        return tempEmployees;

    }

    public List<Employee> queryAll() throws SQLException {
        return query("SELECT * FROM employee");
    }

    public List<Employee> queryByFirstName(String fn) throws SQLException {
        return query("SELECT * FROM employee where firstname = '" + fn + "';");
    }

    public boolean updateEmployee(List<String> data) throws SQLException {

        try {
            PreparedStatement statement = con.prepareStatement("UPDATE employee SET" +
                 " firstname=?, lastname=?,dob=?,hiredate=?,role=? WHERE id=?");
            statement.setString(1, data.get(1));
            statement.setString(2, data.get(2));
            statement.setDate(3, Date.valueOf(data.get(3)));
            statement.setDate(4, Date.valueOf(data.get(4)));
            statement.setString(5, data.get(5));
            statement.setInt(6, Integer.parseInt(data.get(0)));

            statement.executeUpdate();
            statement.close();
            return true;
        } catch(Exception ex) {

            return false;
        }

    }
}
