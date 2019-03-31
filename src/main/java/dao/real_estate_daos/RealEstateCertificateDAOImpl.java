package dao.real_estate_daos;

import dao.interfaces.EntityDAOImpl;
import models.real_estate_models.RealEstateCertificate;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class RealEstateCertificateDAOImpl implements EntityDAOImpl<RealEstateCertificate> {
    public RealEstateCertificate findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(RealEstateCertificate.class, id);
    }

    public void save(RealEstateCertificate realEstateCertificate) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(realEstateCertificate);
        ts.commit();
        session.close();
    }

    public void update(RealEstateCertificate realEstateCertificate) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.update(realEstateCertificate);
        ts.commit();
        session.close();
    }

    public void delete(RealEstateCertificate realEstateCertificate) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(realEstateCertificate);
        ts.commit();
        session.close();
    }
}
