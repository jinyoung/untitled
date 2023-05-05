package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class StudentCreated extends AbstractEvent {

    private String studentId;
    private String name;

    public StudentCreated(Student aggregate) {
        super(aggregate);
    }

    public StudentCreated() {
        super();
    }
}
