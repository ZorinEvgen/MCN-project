import models.District;
import models.FederalEntity;
import services.DistrictService;
import services.FederalEntityService;

public class Main {
    public static void main(String[] args) {
        FederalEntityService federalEntityService = new FederalEntityService();
        DistrictService districtService = new DistrictService();

        FederalEntity federalEntity = federalEntityService.findById(1);
        System.out.println(federalEntity);

        District district = districtService.findById(1);
        System.out.println(district);


    }
}
