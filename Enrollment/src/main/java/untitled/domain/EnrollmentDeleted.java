package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class EnrollmentDeleted extends AbstractEvent {

    private String studentId;
    private String classCode;

    public EnrollmentDeleted(Enrollment aggregate) {
        super(aggregate);
    }

    public EnrollmentDeleted() {
        super();
    }
}
