package ru.suai.eurekaclient.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.suai.eurekaclient.model.Human;
import ru.suai.eurekaclient.model.Man;
import ru.suai.eurekaclient.model.Woman;
import ru.suai.eurekaclient.repository.SimpleRepository;

/**
 * @author rost.
 */
@Configuration
public class SimpleConfig {
    @Bean
    public SimpleRepository getRepo(){
        return new SimpleRepository();
    }

    @Bean
    @Qualifier("man")
    Human getMan(){
        return new Man();
    }

    @Bean
    @Qualifier("woman")
    Human getWoman(){
        return new Woman();
    }
}
