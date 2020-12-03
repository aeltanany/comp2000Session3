package com;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LivesDisplayTest {
    player player1;
    CoinsDisplay display1;


    @Before
    public void SetUp(){
        player1 = new player("juan");
        display1 = new CoinsDisplay(player1);
    }

    @Test
    public void update() {
        player1.setLives(3);;
        System.out.println("test lives : 3");
        player1.updateDisplay();
    }

    @Test
    public void setplayer() {
        player tsetplayer = new player("testplayer");
        display1 = new CoinsDisplay(tsetplayer);
        tsetplayer.setLives(5);
        tsetplayer.updateDisplay();
        assertEquals("testplayer",tsetplayer.getName());
    }
}