package utils;

import models.errand_models.*;
import models.office_devisions_models.Devision;
import models.office_devisions_models.Employee;
import models.office_devisions_models.Office;
import models.real_estate_models.*;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactoryUtil {
    private static SessionFactory sessionFactory;
    private static final String MODELS_PATH = "src.main.java.models";

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
        addingRealEstateModelsToConfig(configuration);
        addingErrandModelsToConfig(configuration);
        addingOfficeDevisionModelsToConfig(configuration);
    }

    private static void addingRealEstateModelsToConfig(Configuration configuration){
        configuration.addAnnotatedClass(FederalEntity.class);
        configuration.addAnnotatedClass(District.class);
        configuration.addAnnotatedClass(BuildingType.class);
        configuration.addAnnotatedClass(Street.class);
        configuration.addAnnotatedClass(Address.class);
        configuration.addAnnotatedClass(EstateType.class);
        configuration.addAnnotatedClass(RealEstate.class);
        configuration.addAnnotatedClass(RealEstateCertificate.class);
    }

    private static void addingErrandModelsToConfig(Configuration configuration){
        configuration.addAnnotatedClass(Errand.class);
        configuration.addAnnotatedClass(ErrandType.class);
        configuration.addAnnotatedClass(ErrandTopic.class);
        configuration.addAnnotatedClass(Inspection.class);
        configuration.addAnnotatedClass(Status.class);
    }

    private static void addingOfficeDevisionModelsToConfig(Configuration configuration){
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Office.class);
        configuration.addAnnotatedClass(Devision.class);
    }
}
