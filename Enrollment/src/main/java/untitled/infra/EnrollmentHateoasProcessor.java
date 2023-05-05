package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class EnrollmentHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Enrollment>> {

    @Override
    public EntityModel<Enrollment> process(EntityModel<Enrollment> model) {
        return model;
    }
}
