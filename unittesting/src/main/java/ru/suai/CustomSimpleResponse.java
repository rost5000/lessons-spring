package ru.suai;

import org.springframework.stereotype.Component;

/**
 * @author rost.
 */
@Component
public class CustomSimpleResponse implements SimpleResponse{
    @Override
    public String helloSayer() {
        return "hello";
    }
}
