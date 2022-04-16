package com.nowcoder.community.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
public class AlphaService {

    public AlphaService(){
        System.out.println("make");
    }

    @PostConstruct
    public void init(){
        System.out.println("initial");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("destroy");
    }

}
