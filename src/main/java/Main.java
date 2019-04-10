
import models.*;
import services.*;
import services.errand_services.*;
import services.office_devisions_services.*;
import services.real_estate_services.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<EntityService> services = new ArrayList<EntityService>();

        services.add(new EstateTypeService());
        services.add(new FederalEntityService());
        services.add(new DistrictService());
        services.add(new BuildingTypeService());
        services.add(new StreetService());
        services.add(new AddressService());
        services.add(new RealEstateService());
        services.add(new RealEstateCertificateService());

        services.add(new OfficeService());
        services.add(new DevisionService());
        services.add(new EmployeeService());

        services.add(new ErrandTopicService());
        services.add(new ErrandTypeService());
        services.add(new InspectionService());
        services.add(new StatusService());
        services.add(new ErrandService());

        for (EntityService service : services){
            DatabaseEntity entity = (DatabaseEntity) service.findById(1);

            if (entity == null) {
                entity = (DatabaseEntity) service.findById(2);
            }

            System.out.println(entity);
            System.out.println();
        }
    }
}
