import dao.CityDAO;
import dao.CityDAOImpl;
import dao.EmployeeDAO;
import dao.EmployeeDAOImpl;
import empCity.City;
import empCity.Employee;

import java.sql.*;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {

        EmployeeDAO employeeDAO = new EmployeeDAOImpl();
        CityDAO cityDAO = new CityDAOImpl();

//        City city1 = new City(67, "Fort");
//
//        cityDAO.create(city1);
//
        System.out.println(cityDAO.getAll());



//            Employee employee1 = new Employee("Fedor", "Sitx", "male", 34, 11);
//
//            employeeDAO.create(employee1);
//            employeeDAO.getById(1);
//
//        System.out.println(employeeDAO.getAll());
    }
}
