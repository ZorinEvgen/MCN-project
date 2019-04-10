package dao.office_devisions_daos;

import dao.interfaces.EntityDAOImpl;
import models.office_devisions_models.Office;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class OfficeDAOImpl implements EntityDAOImpl<Office> {
    public Office findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Office.class, id);
    }

    public void save(Office office) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(office);
        ts.commit();
        session.close();
    }

    public void update(Office office) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.update(office);
        ts.commit();
        session.close();
    }

    public void delete(Office office) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(office);
        ts.commit();
        session.close();
    }
}
