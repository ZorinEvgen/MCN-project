
import models.DatabaseEntity;
import services.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<DatabaseEntityService> services = new ArrayList<DatabaseEntityService>();

        services.add(new FederalEntityService());
        services.add(new DistrictService());
        services.add(new BuildingTypeService());
        services.add(new StreetService());
        services.add(new AddressService());
        services.add(new EstateTypeService());

        for (DatabaseEntityService service : services){
            DatabaseEntity entity = (DatabaseEntity) service.findById(1);
            System.out.println(entity);
        }
    }
}
