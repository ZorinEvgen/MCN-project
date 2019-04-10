package dao.errand_daos;

import dao.interfaces.EntityDAOImpl;
import models.errand_models.Inspection;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class InspectionDAOImpl implements EntityDAOImpl<Inspection> {
    public Inspection findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Inspection.class, id);
    }

    public void save(Inspection inspection) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(inspection);
        ts.commit();
        session.close();
    }

    public void update(Inspection inspection) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.update(inspection);
        ts.commit();
        session.close();
    }

    public void delete(Inspection inspection) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(inspection);
        ts.commit();
        session.close();
    }
}
