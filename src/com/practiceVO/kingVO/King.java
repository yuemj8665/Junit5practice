package com.practiceVO.kingVO;

import lombok.Getter;

@Getter
public class King {
    private String name;

    public King(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}