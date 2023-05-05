package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.StudentApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { StudentApplication.class })
public class CucumberSpingConfiguration {}
