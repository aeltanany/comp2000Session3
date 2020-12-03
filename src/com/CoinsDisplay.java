package com;


public class CoinsDisplay implements IDisplay {
    private Iplayer iplayer;






    public void update(int Coins, int Lives) {
//begin of modifiable zone(JavaCode)......C/bb971d60-5258-4965-86a5-5705a8c1086c
        System.out.println( iplayer.getName()+"'s Coins : " + Coins );
//end of modifiable zone(JavaCode)........E/bb971d60-5258-4965-86a5-5705a8c1086c
    }

    public void Setplayer(Iplayer player) {
//begin of modifiable zone(JavaCode)......C/ee5ac269-2a1b-4e0b-850a-aa306dd19259
this.iplayer = player;
//end of modifiable zone(JavaCode)........E/ee5ac269-2a1b-4e0b-850a-aa306dd19259
    }

    public CoinsDisplay(Iplayer player) {
//begin of modifiable zone(JavaSuper).....C/ab8d8907-1c3d-4490-9507-94b8963c1a25
this.iplayer = player;
this.iplayer.AddDisplay(this);
System.out.println(" ********create coins display for " +this.iplayer.getName() + " ********" );
//end of modifiable zone(JavaSuper).......E/ab8d8907-1c3d-4490-9507-94b8963c1a25
//begin of modifiable zone(JavaCode)......C/ab8d8907-1c3d-4490-9507-94b8963c1a25

//end of modifiable zone(JavaCode)........E/ab8d8907-1c3d-4490-9507-94b8963c1a25
    }

}
