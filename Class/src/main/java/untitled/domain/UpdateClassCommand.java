package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdateClassCommand {

    private String className;
    private String classCode;
    private Integer classSize;
}
