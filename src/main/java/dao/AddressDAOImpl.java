package dao;

import models.Address;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class AddressDAOImpl implements EntityDAOImpl<Address> {
    public Address findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Address.class, id);
    }

    public void save(Address address) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(address);
        ts.commit();
        session.close();
    }

    public void update(Address address) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.getTransaction();
        session.update(address);
        ts.commit();
        session.close();
    }

    public void delete(Address address) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(address);
        ts.commit();
        session.close();
    }
}
