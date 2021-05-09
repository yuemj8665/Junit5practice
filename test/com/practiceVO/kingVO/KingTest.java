package com.practiceVO.kingVO;

import org.junit.Test;

import static org.junit.Assert.*;

public class KingTest {

    @Test
    public void getName() {
        King king = new King("MJ");
        assertEquals("MJ",king.getName());
    }
}