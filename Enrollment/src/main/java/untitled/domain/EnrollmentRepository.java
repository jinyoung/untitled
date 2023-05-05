package untitled.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import untitled.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "enrollments",
    path = "enrollments"
)
public interface EnrollmentRepository
    extends PagingAndSortingRepository<Enrollment, String> {}
