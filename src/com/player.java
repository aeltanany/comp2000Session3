package com;

import java.util.ArrayList;
import java.util.List;

public class player implements Iplayer {
    private String Name;

    private int Coins;

    private int Lives;

    private List<IDisplay> Displays = new ArrayList<IDisplay> ();

    public String getName() {
//begin of modifiable zone................T/fb537daa-a736-4b58-8655-3360d1ee74cb
        // Automatically generated method. Please delete this comment before entering specific code.
//end of modifiable zone..................E/fb537daa-a736-4b58-8655-3360d1ee74cb
//begin of modifiable zone................T/f400110b-de64-4611-a318-26175ee4a6e8
        return this.Name;
//end of modifiable zone..................E/f400110b-de64-4611-a318-26175ee4a6e8
    }

    public player(String Name) {
//begin of modifiable zone................T/af5a7efe-794a-4715-961e-b5f5c9a010b4
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Name = Name;
        System.out.println("Creating player :)" +this.Name + "********");
//end of modifiable zone..................E/af5a7efe-794a-4715-961e-b5f5c9a010b4
    }

    public int getCoins() {
//begin of modifiable zone................T/b8987f62-a4f2-4b9b-9376-19e6609812df
        // Automatically generated method. Please delete this comment before entering specific code.
//end of modifiable zone..................E/b8987f62-a4f2-4b9b-9376-19e6609812df
//begin of modifiable zone................T/292a91a2-3b04-4ce3-a82e-88318a76ab11
        return this.Coins;
//end of modifiable zone..................E/292a91a2-3b04-4ce3-a82e-88318a76ab11
    }

    public void setCoins(int value) {
//begin of modifiable zone................T/9302a104-d74a-4c61-9d99-cb7cf4ff64a0
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Coins = value;
//end of modifiable zone..................E/9302a104-d74a-4c61-9d99-cb7cf4ff64a0
    }

    public int getLives() {
//begin of modifiable zone................T/2d185421-9e4e-46b3-86c9-5e64101a9981
        // Automatically generated method. Please delete this comment before entering specific code.
//end of modifiable zone..................E/2d185421-9e4e-46b3-86c9-5e64101a9981
//begin of modifiable zone................T/0be8c801-c834-480b-8eb4-b3563426ad7d
        return this.Lives;
//end of modifiable zone..................E/0be8c801-c834-480b-8eb4-b3563426ad7d
    }

    public void setLives(int value) {
//begin of modifiable zone................T/89cc816e-a965-45c5-a94d-22d77e71cdc2
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Lives = value;
//end of modifiable zone..................E/89cc816e-a965-45c5-a94d-22d77e71cdc2
    }

    public void AddDisplay(IDisplay Display) {
//begin of modifiable zone(JavaCode)......C/decb9fd8-6a1e-47b5-ae03-b9acb31a91d2
      System.out.println(Name + " adding display...... " + Display);
      Displays.add(Display);
//end of modifiable zone(JavaCode)........E/decb9fd8-6a1e-47b5-ae03-b9acb31a91d2
    }

    public void RemoveDisplay(IDisplay Display) {
//begin of modifiable zone(JavaCode)......C/efd584b6-d6b9-40b1-b50e-c11440a008df
        System.out.println(Name + " removing display...... " + Display);
        Displays.remove(Display);
//end of modifiable zone(JavaCode)........E/efd584b6-d6b9-40b1-b50e-c11440a008df
    }

    public void updateDisplay() {
//begin of modifiable zone(JavaCode)......C/5289677a-a9e6-42dc-ad2b-165b03a0f093
        System.out.println(  " updating display...... " );
        for (IDisplay display: Displays){
            display.update(Coins,Lives);
        }
//end of modifiable zone(JavaCode)........E/5289677a-a9e6-42dc-ad2b-165b03a0f093
    }

}
