package com;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CoinsDisplayTest {
player player1;
CoinsDisplay display1;


@Before
public void SetUp(){
    player1 = new player("juan");
    display1 = new CoinsDisplay(player1);
}

    @Test
    public void update() {
    player1.setCoins(10);
    System.out.println("test coins : 10");
    player1.updateDisplay();
    }

    @Test
    public void setplayer() {
    player tsetplayer = new player("testplayer");
    display1 = new CoinsDisplay(tsetplayer);
    tsetplayer.setCoins(15);
    tsetplayer.updateDisplay();
    assertEquals("testplayer",tsetplayer.getName());

    }
}