package dao.errand_daos;

import dao.interfaces.EntityDAOImpl;
import models.errand_models.ErrandTopic;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class ErrandTopicDAOImpl implements EntityDAOImpl<ErrandTopic> {
    public ErrandTopic findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(ErrandTopic.class, id);
    }

    public void save(ErrandTopic errandTopic) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(errandTopic);
        ts.commit();
        session.close();
    }

    public void update(ErrandTopic errandTopic) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.update(errandTopic);
        ts.commit();
        session.close();
    }

    public void delete(ErrandTopic errandTopic) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(errandTopic);
        ts.commit();
        session.close();
    }
}
