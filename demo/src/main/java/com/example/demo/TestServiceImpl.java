package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class TestServiceImpl implements TestService {
    @Override
    public boolean test() {
        return false;
    }
}
