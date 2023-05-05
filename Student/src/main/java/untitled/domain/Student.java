package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.StudentApplication;
import untitled.domain.StudentCreated;
import untitled.domain.StudentDeleted;
import untitled.domain.StudentUpdated;

@Entity
@Table(name = "Student_table")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String studentId;

    private String name;

    @PostPersist
    public void onPostPersist() {
        StudentCreated studentCreated = new StudentCreated(this);
        studentCreated.publishAfterCommit();

        StudentUpdated studentUpdated = new StudentUpdated(this);
        studentUpdated.publishAfterCommit();

        StudentDeleted studentDeleted = new StudentDeleted(this);
        studentDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static StudentRepository repository() {
        StudentRepository studentRepository = StudentApplication.applicationContext.getBean(
            StudentRepository.class
        );
        return studentRepository;
    }
}
