package dao;

import models.District;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class DistrictsDAOImpl implements EntityDAOImpl<District> {

    public District findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(District.class, id);
    }

    public void save(District district) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(district);
        ts.commit();
        session.close();
    }

    public void update(District district) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.update(district);
        ts.commit();
        session.close();
    }

    public void delete(District district) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(district);
        ts.commit();
        session.close();
    }
}
