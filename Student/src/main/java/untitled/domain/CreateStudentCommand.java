package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateStudentCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String studentId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String name;
}
