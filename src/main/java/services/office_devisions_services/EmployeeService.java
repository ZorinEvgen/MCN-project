package services.office_devisions_services;

import dao.office_devisions_daos.EmployeeDAOImpl;
import models.office_devisions_models.Employee;
import services.EntityService;

public class EmployeeService extends EntityService<Employee> {
    public EmployeeService() {
        setImpl(new EmployeeDAOImpl());
    }
}
