package dao.real_estate_daos;

import dao.interfaces.EntityDAOImpl;
import models.real_estate_models.Street;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class StreetDAOImpl implements EntityDAOImpl<Street> {
    public Street findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Street.class, id);
    }

    public void save(Street street) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(street);
        ts.commit();
        session.close();
    }

    public void update(Street street) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.update(street);
        ts.commit();
        session.close();
    }

    public void delete(Street street) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(street);
        ts.commit();
        session.close();
    }
}
