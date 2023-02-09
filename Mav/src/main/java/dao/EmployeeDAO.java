package dao;

import empCity.Employee;

import java.sql.SQLException;
import java.util.List;

public interface EmployeeDAO {

    void create(Employee employee);
    Employee getById(int id) throws SQLException;
    List<Employee> getAll() throws SQLException;
    void update(Employee employee) throws SQLException;
    void delete(Employee employee) throws SQLException;

//    enum Queries {
//        GET("SELECT * FROM employee INNER JOIN city ON employee.city_id=city.city_id AND employee.id=(?"),
//        GET_ALL("SELECT * FROM employee INNER JOIN city ON employee.city_id=city.city_id"),
//        INSERT("INSERT INTO employee (first_name, last_name, age, gender, city_id) VALUES ((?), (?), (?), (?), (?))"),
//        DELETE("DELETE FROM employee WHERE employee.id=(?)"),
//        UPDATE("UPDATE employee SET city_id=(?) WHERE employee.id=(?)");
//
//        String query;
//
//        Queries(String query) {
//            this.query = query;
//        }
//    }
}
