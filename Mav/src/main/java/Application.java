import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import empCity.Employee;

import java.sql.*;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {

        final String user = "postgres";
        final String password = "DoberMan626";
        final String url = "jdbc:postgresql://localhost:5432/postgres";

        try (final Connection connection = DriverManager.getConnection(url, user, password)) {

            EmployeeDAO employeeDAO = new EmployeeDAOImpl(connection);
                employeeDAO.deleteById(2);
            employeeDAO.updateById(1, 34);
            List<Employee> employees = employeeDAO.getAll();

            for (Employee employee : employees) {
                System.out.println(employee);
            }


        }
    }
}
