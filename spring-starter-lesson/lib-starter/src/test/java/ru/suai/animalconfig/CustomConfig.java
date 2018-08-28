package ru.suai.animalconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.suai.model.Animal;
import ru.suai.model.Cat;

/**
 * @author rost.
 */
@Configuration
public class CustomConfig{
    @Bean
    public Animal getAnimal(){return new Cat();
    }
}