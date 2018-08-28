package ru.suai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rost.
 */
@RestController
public class SimpleRest {
    private SimpleResponse response;

    @Autowired
    public SimpleRest(SimpleResponse response){
        this.response = response;
    }

    @RequestMapping("/")
    public String hello(){
        return response.helloSayer();
    }
}
