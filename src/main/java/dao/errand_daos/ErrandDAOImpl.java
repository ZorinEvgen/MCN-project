package dao.errand_daos;

import dao.interfaces.EntityDAOImpl;
import models.errand_models.Errand;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class ErrandDAOImpl implements EntityDAOImpl<Errand> {
    public Errand findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Errand.class, id);
    }

    public void save(Errand errand) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(errand);
        ts.commit();
        session.close();

    }

    public void update(Errand errand) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.update(errand);
        ts.commit();
        session.close();
    }

    public void delete(Errand errand) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(errand);
        ts.commit();
        session.close();
    }
}
