package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class StudentUpdated extends AbstractEvent {

    private String studentId;
    private String name;

    public StudentUpdated(Student aggregate) {
        super(aggregate);
    }

    public StudentUpdated() {
        super();
    }
}
