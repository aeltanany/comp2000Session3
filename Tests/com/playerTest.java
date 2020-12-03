package com;

import org.junit.*;

import static org.junit.Assert.*;

public class playerTest {
         player player1;

         @BeforeClass
         public  static void SetUpBefore(){
             System.out.println("**** before Class *******");

         }

         @Before
         public  void SetUp(){
             System.out.println("**** Before *******");
         player1 = new player("sans");
         }


    @Test
    public void getName() {
        System.out.println("**** test  get Nme *******");
        boolean matchingName = !player1.getName().equals("sans");
        assertFalse(matchingName);
    }


    @Test
    public void setCoins() {
        System.out.println("**** test set coins  *******");
        player1.setCoins(30);
        boolean matchingCoins = player1.getCoins() !=(30);
        assertFalse(matchingCoins);
    }


    @Test
    public void getCoins() {
        System.out.println("**** before Class *******");
    }

    @Test
    public void setLives() {

        System.out.println("**** test set lives  *******");
        player1.setCoins(3);
        boolean matchinglives = player1.getLives() !=(3);
        assertFalse(matchinglives);


    }

    @Test
    public void getLives() {
        System.out.println("**** get lives *******");
    }






    @After
    public  void teardwon() {
        System.out.println("**** After *******");
    }

    @AfterClass
    public  static void SetUpAfter(){
        System.out.println("**** after Class *******");

    }

}