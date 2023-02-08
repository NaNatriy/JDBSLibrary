import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import empCity.Employee;

import java.sql.*;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {

//        final String user = "postgres";
//        final String password = "DoberMan626";
//        final String url = "jdbc:postgresql://localhost:5432/postgres";
//
//        try (final Connection connection = DriverManager.getConnection(url, user, password)) {}

            EmployeeDAO employeeDAO = new EmployeeDAOImpl();
//            Employee employee1 = new Employee("Fedor", "Sitx", "male", 34, 11);
//
//            employeeDAO.create(employee1);
            employeeDAO.getById(1);
//
//        System.out.println(employeeDAO.getAll());
    }
}
