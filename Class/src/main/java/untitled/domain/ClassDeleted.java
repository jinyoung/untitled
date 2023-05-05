package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class ClassDeleted extends AbstractEvent {

    private String className;
    private String classCode;

    public ClassDeleted(Class aggregate) {
        super(aggregate);
    }

    public ClassDeleted() {
        super();
    }
}
