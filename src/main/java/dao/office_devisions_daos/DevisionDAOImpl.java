package dao.office_devisions_daos;

import dao.interfaces.EntityDAOImpl;
import models.office_devisions_models.Devision;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class DevisionDAOImpl implements EntityDAOImpl<Devision> {
    public Devision findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Devision.class, id);
    }

    public void save(Devision devision) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(devision);
        ts.commit();
        session.close();
    }

    public void update(Devision devision) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.update(devision);
        ts.commit();
        session.close();
    }

    public void delete(Devision devision) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(devision);
        ts.commit();
        session.close();
    }
}
