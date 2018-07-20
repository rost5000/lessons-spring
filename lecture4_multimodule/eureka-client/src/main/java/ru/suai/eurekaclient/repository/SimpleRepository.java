package ru.suai.eurekaclient.repository;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import ru.suai.eurekaclient.model.SimpleRespose;

import java.util.ArrayList;
import java.util.List;

/**
 * @author rost.
 */

public class SimpleRepository {
    private List<SimpleRespose>list = new ArrayList<SimpleRespose>();

    public void save(SimpleRespose respose){
        list.add(respose);
    }
}
