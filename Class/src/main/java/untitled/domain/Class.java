package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.ClassApplication;
import untitled.domain.ClassCreated;
import untitled.domain.ClassDeleted;
import untitled.domain.ClassUpdated;

@Entity
@Table(name = "Class_table")
@Data
public class Class {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String className;

    private String classCode;

    private Integer classSize;

    @PostPersist
    public void onPostPersist() {
        ClassCreated classCreated = new ClassCreated(this);
        classCreated.publishAfterCommit();

        ClassUpdated classUpdated = new ClassUpdated(this);
        classUpdated.publishAfterCommit();

        ClassDeleted classDeleted = new ClassDeleted(this);
        classDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ClassRepository repository() {
        ClassRepository classRepository = ClassApplication.applicationContext.getBean(
            ClassRepository.class
        );
        return classRepository;
    }
}
