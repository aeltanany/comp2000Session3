package com;


public class LivesDisplay implements IDisplay {
    private Iplayer iplayer;

    public void update(int Coins, int Lives) {
//begin of modifiable zone(JavaCode)......C/f281d5f5-08fc-446f-a3c5-46b7e40de7b1
        System.out.println( iplayer.getName()+"'s Lives : " + Lives );
//end of modifiable zone(JavaCode)........E/f281d5f5-08fc-446f-a3c5-46b7e40de7b1
    }

    public void Setplayer(Iplayer player) {
//begin of modifiable zone(JavaCode)......C/3dad6387-823a-404a-859b-b4b3c4e99bd3
        this.iplayer = player;
//end of modifiable zone(JavaCode)........E/3dad6387-823a-404a-859b-b4b3c4e99bd3
    }

    public LivesDisplay(Iplayer player) {
//begin of modifiable zone(JavaSuper).....C/5e6c9250-de21-4839-9f24-77661e232eb8
        this.iplayer = player;
        this.iplayer.AddDisplay(this);
        System.out.println(" ********create lives display for " +this.iplayer.getName() + " ********" );
//end of modifiable zone(JavaSuper).......E/5e6c9250-de21-4839-9f24-77661e232eb8
//begin of modifiable zone(JavaCode)......C/5e6c9250-de21-4839-9f24-77661e232eb8

//end of modifiable zone(JavaCode)........E/5e6c9250-de21-4839-9f24-77661e232eb8
    }

}
