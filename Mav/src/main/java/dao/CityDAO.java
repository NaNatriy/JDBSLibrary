package dao;

import empCity.City;

import java.sql.SQLException;
import java.util.List;

public interface CityDAO {
    void create(City city);
    City getById(int id) throws SQLException;
    List<City> getAll() throws SQLException;
    void update(City city) throws SQLException;
    void delete(City city) throws SQLException;
}
