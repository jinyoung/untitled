package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class EnrollmentCreated extends AbstractEvent {

    private String studentId;
    private String classCode;

    public EnrollmentCreated(Enrollment aggregate) {
        super(aggregate);
    }

    public EnrollmentCreated() {
        super();
    }
}
