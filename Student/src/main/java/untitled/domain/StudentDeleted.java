package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class StudentDeleted extends AbstractEvent {

    private String studentId;

    public StudentDeleted(Student aggregate) {
        super(aggregate);
    }

    public StudentDeleted() {
        super();
    }
}
