package ru.suai.eurekaclient.controller;

import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.suai.eurekaclient.model.SimpleRespose;
import ru.suai.eurekaclient.repository.SimpleRepository;

import java.util.UUID;

/**
 * @author rost.
 * В этом классе пример использования REST ответа + пример логгирования событий
 */
@RestController
public class RestfulController {
    Logger logger = LoggerFactory.getLogger(RestfulController.class);
    @Autowired
    SimpleRepository repo;


    @RequestMapping(value = "/clientapi/simpleresponse", method = RequestMethod.GET)
    SimpleRespose getResponse(
            @RequestParam(name = "id", required = false, defaultValue = "default")
                    String id,
            @RequestParam(name = "value", required = false, defaultValue = "123")
                    String value){

        SimpleRespose respose = new SimpleRespose();

        if(id.contentEquals("default"))
            respose.setId(UUID.randomUUID().toString());
        else
            respose.setId(id);
        respose.setValue(value);
        logger.info("Sending answer: {}", respose);
        return respose;
    }

}
