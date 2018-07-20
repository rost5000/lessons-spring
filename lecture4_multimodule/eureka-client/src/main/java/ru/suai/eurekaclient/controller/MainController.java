package ru.suai.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import ru.suai.eurekaclient.model.Human;
import ru.suai.eurekaclient.service.ServiceCaller;

/**
 * @author rost.
 * Здесь должна быть вся бизнес-логика приложения
 */
@Controller
public class MainController {
    protected ServiceCaller serviceCaller;
    private Human human;

    @Autowired
    public MainController(ServiceCaller serviceCaller, @Qualifier("woman") Human human){
        this.serviceCaller = serviceCaller;
        this.human = human;
    }

    @RequestMapping(value = "/say")
    @ResponseBody
    String saysmth(){
        return human.talk();
    }
//localhot:8080/
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    String getIndex(){
        return serviceCaller.getSimpleResponse().toString();
    }
}
