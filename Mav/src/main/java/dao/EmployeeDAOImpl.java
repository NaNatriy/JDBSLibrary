package dao;

import config.HibernateSFU;
import empCity.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.*;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    @Override
    public void create(Employee employee) {
        try (Session session = HibernateSFU.getSessionFactory().openSession()) {

            Transaction transaction = session.beginTransaction();
            session.save(employee);
            transaction.commit();
        }
    }

    @Override
    public Employee getById(int id) {
        try (Session session = HibernateSFU.getSessionFactory().openSession()) {
            return session.get(Employee.class, id);
        }
    }

    @Override
    public List getAll() {
        try (Session session = HibernateSFU.getSessionFactory().openSession()) {
            return session.createQuery(" FROM Employee").list();
        }
    }

    @Override
    public void update(Employee employee) throws SQLException {
        try (Session session = HibernateSFU.getSessionFactory().openSession()) {

            Transaction transaction = session.beginTransaction();
            session.update(employee);
            transaction.commit();
        }
    }

    @Override
    public void delete(Employee employee) throws SQLException {
        try (Session session = HibernateSFU.getSessionFactory().openSession()) {

            Transaction transaction = session.beginTransaction();
            session.delete(employee);
            transaction.commit();
        }
    }
}

//    private Connection connection;
//
//    public EmployeeDAOImpl(Connection connection) {
//        this.connection = connection;
//    }
//    @Override
//    public void create(Employee employee) {
//        try (PreparedStatement statement = connection.prepareStatement(Queries.INSERT.query)) {
//            statement.setString(1, employee.getFirst_name());
//            statement.setString(2, employee.getLast_name());
//            statement.setInt(3, employee.getAge());
//            statement.setString(4, employee.getGender());
//            statement.setInt(5, employee.getCity_id());
//
//            statement.executeQuery();
//
//        } catch (SQLException e) {
//        }
//    }
//
//    @Override
//    public Employee getById(int id) throws SQLException {
//
//        Employee employee = new Employee();
//
//        try (PreparedStatement statement = connection.prepareStatement(Queries.GET.query)) {
//
//            statement.setInt(1, 1);
//            ResultSet resultSet = statement.executeQuery();
//
//            while (resultSet.next()) {
//                employee.setId(Integer.parseInt(resultSet.getString("id")));
//                employee.setFirst_name(resultSet.getString("first_name"));
//                employee.setLast_name(resultSet.getString("last_name"));
//                employee.setAge(Integer.parseInt(resultSet.getString("last_name")));
//                employee.setGender(resultSet.getString("gender"));
//                employee.setCity_id(Integer.parseInt((resultSet.getInt("city_id"),
//                    resultSet.getString("city_name")));
//
//            }
//        }
//        return employee;
//    }
//
//
//    @Override
//    public List<Employee> getAll() throws SQLException {
//        List<Employee> employees = new ArrayList<>();
//        try(PreparedStatement statement = connection.prepareStatement(Queries.GET_ALL.query)) {
//            ResultSet resultSet = statement.executeQuery();
//
//            while (resultSet.next()) {
//                int id = (Integer.parseInt(resultSet.getString("id")));
//                String first_name = (resultSet.getString("first_name"));
//                String last_name = (resultSet.getString("last_name"));
//                int age = (Integer.parseInt(resultSet.getString("age")));
//                String gender = (resultSet.getString("gender"));
//                int city_id = (Integer.parseInt((resultSet.getString("city_id"),
//                resultSet.getString("city_name")));
//
//                employees.add(new Employee(id, first_name, last_name, gender, age, city_id));
//            }
//        }
//        return employees;
//    }
//
//    @Override
//    public void update(Employee employee) throws SQLException {
//        try(PreparedStatement statement = connection.prepareStatement(Queries.UPDATE.query)) {
//
//
//            statement.execute();
//        }
//    }
//
//    @Override
//    public void delete(Employee employee) throws SQLException {
//        try(PreparedStatement statement = connection.prepareStatement(Queries.DELETE.query)) {
//            statement.execute();
//        }



