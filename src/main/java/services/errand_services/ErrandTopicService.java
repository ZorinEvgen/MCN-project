package services.errand_services;

import dao.errand_daos.ErrandTopicDAOImpl;
import models.errand_models.ErrandTopic;
import services.EntityService;

public class ErrandTopicService extends EntityService<ErrandTopic> {
    public ErrandTopicService() {
        setImpl(new ErrandTopicDAOImpl());
    }
}
