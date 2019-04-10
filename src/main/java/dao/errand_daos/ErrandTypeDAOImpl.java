package dao.errand_daos;

import dao.interfaces.EntityDAOImpl;
import models.errand_models.ErrandType;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class ErrandTypeDAOImpl implements EntityDAOImpl<ErrandType> {
    public ErrandType findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(ErrandType.class, id);
    }

    public void save(ErrandType errandType) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(errandType);
        ts.commit();
        session.close();
    }

    public void update(ErrandType errandType) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.update(errandType);
        ts.commit();
        session.close();
    }

    public void delete(ErrandType errandType) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(errandType);
        ts.commit();
        session.close();
    }
}
