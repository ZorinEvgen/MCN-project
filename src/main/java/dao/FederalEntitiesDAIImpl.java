package dao;

import models.FederalEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class FederalEntitiesDAIImpl implements EntityDAOImpl<FederalEntity> {

    public FederalEntity findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(FederalEntity.class, id);
    }

    public void save(FederalEntity federalEntity) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(federalEntity);
        ts.commit();
        session.close();
    }

    public void update(FederalEntity federalEntity) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.update(federalEntity);
        ts.commit();
        session.close();
    }

    public void delete(FederalEntity federalEntity) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(federalEntity);
        ts.commit();
        session.close();
    }
}
