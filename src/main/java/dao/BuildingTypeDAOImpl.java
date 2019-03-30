package dao;

import dao.interfaces.BuildingTypeDAO;
import models.BuildingType;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class BuildingTypeDAOImpl implements BuildingTypeDAO {

    public BuildingType findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(BuildingType.class, id);
    }

    public void save(BuildingType buildingType) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(buildingType);
        ts.commit();
        session.close();
    }

    public void update(BuildingType buildingType) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.update(buildingType);
        ts.commit();
        session.close();
    }

    public void delete(BuildingType buildingType) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(buildingType);
        ts.commit();
        session.close();
    }
}
