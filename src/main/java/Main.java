
import models.DatabaseEntity;
import services.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DatabaseEntityService> services = new ArrayList<DatabaseEntityService>();

        services.add(new EstateTypeService());
        services.add(new FederalEntityService());
        services.add(new DistrictService());
        services.add(new BuildingTypeService());
        services.add(new StreetService());
        services.add(new AddressService());
        services.add(new RealEstateService());

        for (DatabaseEntityService service : services){
            DatabaseEntity entity = (DatabaseEntity) service.findById(1);

            if (entity == null) {
                entity = (DatabaseEntity) service.findById(2);
            }

            System.out.println(entity);
        }
    }
}
