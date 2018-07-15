package ru.suai.eurekaclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.suai.eurekaclient.model.SimpleRespose;

/**
 * @author rost.
 * Этот класс должен был показать MVC модель: реализация отдельно,
 */
@Service
public class ServiceCaller {
    private SimpleApi simpleApi;
    @Autowired
    public ServiceCaller(SimpleApi simpleApi){
        this.simpleApi = simpleApi;
    }

    public SimpleRespose getSimpleResponse(){
        return simpleApi.getSimpleResponse();
    }
}
