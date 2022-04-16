package com.nowcoder.community.dao;

import org.springframework.stereotype.Repository;

@Repository("alphaOne")
public class AlphaDaoHi implements Alphadao{
    @Override
    public String select() {
        return "Hi";
    }
}
