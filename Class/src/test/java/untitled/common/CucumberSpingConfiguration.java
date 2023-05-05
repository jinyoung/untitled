package untitled.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import untitled.ClassApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ClassApplication.class })
public class CucumberSpingConfiguration {}
