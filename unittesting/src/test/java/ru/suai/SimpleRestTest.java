package ru.suai;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * @author rost.
 */
public class SimpleRestTest {
    private SimpleRest controller;

    @Mock
    private SimpleResponse response;

    @Before
    public void initialize(){
        MockitoAnnotations.initMocks(this);
        controller = new SimpleRest(response);
    }

    @Test
    public void hello() {
        when(response.helloSayer()).thenReturn("hello");

        assertEquals(controller.hello(), "hello");
    }
}