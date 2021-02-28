package com;

import org.junit.Test;

import static org.junit.Assert.*;

public class KingTest {

    @Test
    public void getNameSuccess(){
        King king = new King("king");
        assertEquals("king",king.getName());
    }

    @Test
    public void getNameFail(){
        King king = new King("king");
        assertEquals("Queen",king.getName());
    }

}