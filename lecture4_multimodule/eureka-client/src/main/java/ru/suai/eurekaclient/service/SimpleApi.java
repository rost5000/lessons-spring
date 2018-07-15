package ru.suai.eurekaclient.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import ru.suai.eurekaclient.model.SimpleRespose;

/**
 * @author rost.
 * Этот класс дёргает API, которое реализовано внутри этого приложения
 * Название приложения в bootstap.properties
 */
@FeignClient("a-bootiful-client")
interface SimpleApi {
    @RequestMapping("/clientapi/simpleresponse")
    SimpleRespose getResponse(@PathVariable("id")String id,
                              @PathVariable("value")String value);
    @RequestMapping(method = RequestMethod.GET, value = "/clientapi/simpleresponse")
    SimpleRespose getSimpleResponse();
}
