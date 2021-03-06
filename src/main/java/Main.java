
import models.DatabaseEntity;
import services.*;
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


        for (EntityService service : services){
            DatabaseEntity entity = (DatabaseEntity) service.findById(1);

            if (entity == null) {
                entity = (DatabaseEntity) service.findById(2);
            }

            System.out.println(entity);
        }
    }
}
