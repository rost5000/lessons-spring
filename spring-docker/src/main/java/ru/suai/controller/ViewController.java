package ru.suai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @author rost.
 */
@Controller
public class ViewController {
    @RequestMapping("/")
    @ResponseBody
    Map<String, String> sayHello(){
        return Collections.singletonMap("Answer", "Hello");
    }
}
