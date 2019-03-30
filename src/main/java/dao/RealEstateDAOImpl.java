package dao;

import models.RealEstate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class RealEstateDAOImpl implements EntityDAOImpl<RealEstate> {
    public RealEstate findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(RealEstate.class, id);
    }

    public void save(RealEstate realEstate) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(realEstate);
        ts.commit();
        session.close();
    }

    public void update(RealEstate realEstate) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.update(realEstate);
        ts.commit();
        session.close();
    }

    public void delete(RealEstate realEstate) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(realEstate);
        ts.commit();
        session.close();
    }
}
