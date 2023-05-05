package untitled.domain;

import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

@Data
@ToString
public class ClassCreated extends AbstractEvent {

    private String className;
    private String classCode;
    private Integer classSize;

    public ClassCreated(Class aggregate) {
        super(aggregate);
    }

    public ClassCreated() {
        super();
    }
}
