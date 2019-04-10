package dao.errand_daos;

import dao.interfaces.EntityDAOImpl;
import models.errand_models.Status;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class StatusDAOImpl implements EntityDAOImpl<Status> {
    public Status findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Status.class, id);
    }

    public void save(Status status) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(status);
        ts.commit();
        session.close();
    }

    public void update(Status status) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.update(status);
        ts.commit();
        session.close();
    }

    public void delete(Status status) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(status);
        ts.commit();
        session.close();
    }
}
