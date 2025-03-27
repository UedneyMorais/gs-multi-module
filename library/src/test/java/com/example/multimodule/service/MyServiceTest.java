package com.example.multimodule.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MyServiceTest {
    
    @Test
    public void testServiceMessage() {
        MyService service = new MyService();
        assertEquals("Hello from Library!", service.getMessage());
    }
}