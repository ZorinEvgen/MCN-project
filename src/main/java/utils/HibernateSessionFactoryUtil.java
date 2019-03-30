package utils;

import models.BuildingType;
import models.District;
import models.FederalEntity;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;


public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;

    private HibernateSessionFactoryUtil(){}

    public static SessionFactory getSessionFactory(){
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration().configure();

//                 Adding annotated classes
                addingAnnotatedClasses(configuration);
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());

            } catch (Exception e){
                System.out.println("Исключение " + e);
            }
        }
        return sessionFactory;
    }

    private static void addingAnnotatedClasses(Configuration configuration){
        configuration.addAnnotatedClass(FederalEntity.class);
        configuration.addAnnotatedClass(District.class);
        configuration.addAnnotatedClass(BuildingType.class);
    }
}
