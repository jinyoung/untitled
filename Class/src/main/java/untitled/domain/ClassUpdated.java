package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class ClassUpdated extends AbstractEvent {

    private String className;
    private String classCode;
    private Integer classSize;

    public ClassUpdated(Class aggregate) {
        super(aggregate);
    }

    public ClassUpdated() {
        super();
    }
}
