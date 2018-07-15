package ru.suai.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.suai.eurekaclient.service.ServiceCaller;

/**
 * @author rost.
 * Здесь должна быть вся бизнес-логика приложения
 */
@Controller
public class MainController {
    protected ServiceCaller serviceCaller;

    @Autowired
    public MainController(ServiceCaller serviceCaller){
        this.serviceCaller = serviceCaller;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    String getIndex(){
        return serviceCaller.getSimpleResponse().toString();
    }
}
