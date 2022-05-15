package com.openclassroom.helloword.service;

import com.openclassroom.helloword.model.HelloWord;

import org.springframework.stereotype.Component;

@Component
public class BusinessService {

    public HelloWord getHelloWord() {
        return new HelloWord();
    }

}
