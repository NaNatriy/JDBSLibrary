package dao;

import config.HibernateSFU;
import empCity.City;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.SQLException;
import java.util.List;

public class CityDAOImpl implements CityDAO {
    @Override
    public void create(City city) {
        try(Session session = HibernateSFU.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(city);
            transaction.commit();
        }
    }

    @Override
    public City getById(int id) throws SQLException {
        try(Session session = HibernateSFU.getSessionFactory().openSession()) {
            return session.get(City.class, id);
        }
    }

    @Override
    public List<City> getAll() throws SQLException {
        try(Session session = HibernateSFU.getSessionFactory().openSession()) {
            return session.createQuery("FROM City").list();
        }
    }

    @Override
    public void update(City city) throws SQLException {
        try(Session session = HibernateSFU.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.update(city);
            transaction.commit();
        }
    }

    @Override
    public void delete(City city) throws SQLException {
        try(Session session = HibernateSFU.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.delete(city);
            transaction.commit();
        }
    }
}
