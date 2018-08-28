package ru.suai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author rost.
 */
@SpringBootApplication
@EnableFeignClients
public class ApplicationMain {
    public static void main(String ... args){
        SpringApplication.run(ApplicationMain.class);
    }
}
