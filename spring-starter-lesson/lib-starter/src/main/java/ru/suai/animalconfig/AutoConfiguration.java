package ru.suai.animalconfig;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.suai.AnimalsFacrory;
import ru.suai.model.Animal;

/**
 * @author rost.
 */
@Configuration
@ConditionalOnClass(AnimalsFacrory.class)
public class AutoConfiguration {
    @Bean
    @ConditionalOnMissingBean
    public AnimalsFacrory getAnimalsFactory(Animal animal){
        return new AnimalsFacrory(animal);
    }
}
