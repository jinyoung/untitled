package untitled.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.EnrollmentApplication;
import untitled.domain.EnrollmentCreated;
import untitled.domain.EnrollmentDeleted;

@Entity
@Table(name = "Enrollment_table")
@Data
public class Enrollment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String studentId;

    private String classCode;

    @PostPersist
    public void onPostPersist() {
        EnrollmentCreated enrollmentCreated = new EnrollmentCreated(this);
        enrollmentCreated.publishAfterCommit();

        EnrollmentDeleted enrollmentDeleted = new EnrollmentDeleted(this);
        enrollmentDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static EnrollmentRepository repository() {
        EnrollmentRepository enrollmentRepository = EnrollmentApplication.applicationContext.getBean(
            EnrollmentRepository.class
        );
        return enrollmentRepository;
    }

    public static void enrollmentLimitPolicy(ClassCreated classCreated) {
        /** Example 1:  new item 
        Enrollment enrollment = new Enrollment();
        repository().save(enrollment);

        */

        /** Example 2:  finding and process
        
        repository().findById(classCreated.get???()).ifPresent(enrollment->{
            
            enrollment // do something
            repository().save(enrollment);


         });
        */

    }
}
