package dao;

import models.EstateType;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class EstateTypeDAOImpl implements EntityDAOImpl<EstateType> {

    public EstateType findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(EstateType.class, id);
    }

    public void save(EstateType estateType) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(estateType);
        ts.commit();
        session.close();
    }

    public void update(EstateType estateType) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.update(estateType);
        ts.commit();
        session.close();
    }

    public void delete(EstateType estateType) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(estateType);
        ts.commit();
        session.close();
    }
}
