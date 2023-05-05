package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.EnrollmentApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { EnrollmentApplication.class })
public class CucumberSpingConfiguration {}
