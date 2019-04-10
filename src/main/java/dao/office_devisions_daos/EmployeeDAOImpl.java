package dao.office_devisions_daos;

import dao.interfaces.EntityDAOImpl;
import models.office_devisions_models.Employee;
import org.hibernate.Session;
import org.hibernate.Transaction;
import utils.HibernateSessionFactoryUtil;

public class EmployeeDAOImpl implements EntityDAOImpl<Employee> {
    public Employee findById(int id) {
        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(Employee.class, id);
    }

    public void save(Employee employee) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.save(employee);
        ts.commit();
        session.close();
    }

    public void update(Employee employee) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.update(employee);
        ts.commit();
        session.close();
    }

    public void delete(Employee employee) {
        Session session = HibernateSessionFactoryUtil.getSessionFactory().openSession();
        Transaction ts = session.beginTransaction();
        session.delete(employee);
        ts.commit();
        session.close();
    }
}
