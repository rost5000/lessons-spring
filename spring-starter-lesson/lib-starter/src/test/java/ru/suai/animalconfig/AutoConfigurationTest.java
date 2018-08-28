package ru.suai.animalconfig;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.suai.AnimalsFacrory;
import ru.suai.model.Animal;
import ru.suai.model.Cat;

import static org.junit.Assert.*;

/**
 * @author rost.
 */

public class AutoConfigurationTest {

    @Test
    public void integrateText(){
        ApplicationContextRunner applicationContext =
                new ApplicationContextRunner()
                .withConfiguration(AutoConfigurations.of(AutoConfiguration.class, CustomConfig.class));

        applicationContext.withUserConfiguration(AutoConfiguration.class)
                .run(context -> {
                    assertNotNull(
                            context.getBean(AnimalsFacrory.class)
                    );
                });
    }
}