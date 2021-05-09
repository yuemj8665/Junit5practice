package com.practiceVO.mjVO;

import org.junit.Test;

import static org.junit.Assert.*;

public class MJTest {

    @Test
    public void getNameSuccess() {
        MJ mj = new MJ("mj");
        assertEquals("mj",mj.getName());

    }

    @Test
    public void getNameFail(){
        MJ mj = new MJ("mj");
        assertEquals("asdasd",mj.getName());
    }
}