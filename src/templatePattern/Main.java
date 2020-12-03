package templatePattern;


import templatePattern.FBX;

public class Main {

    public static void main(String[] args) {
//player mario = new player("Mario");
//
//mario.setCoins(20);
//mario.setLives(3);
//
//IDisplay CoinDisplay = new CoinsDisplay(mario) ;
//IDisplay LivesDisplay = new LivesDisplay(mario) ;
//mario.updateDisplay();
//
//        player luege = new player("luege");
//
//        luege.setCoins(420);
//        luege.setLives(69);
//luege.AddDisplay(CoinDisplay);
//luege.AddDisplay(LivesDisplay);
////        IDisplay CoinDisplayluege = new CoinsDisplay(luege) ;
////        IDisplay LivesDisplayluege = new LivesDisplay(luege) ;
//        CoinDisplay.Setplayer(luege);
//        LivesDisplay.Setplayer(luege);
//        luege.updateDisplay();
//     //   mario.RemoveDisplay(CoinDisplayMario);
//
//        CoinDisplay.Setplayer(mario);
//        LivesDisplay.Setplayer(mario);
//         mario.updateDisplay();



         //--------------------------------------------------------------------------------



        FBX a3dshape = new FBX();
        a3dshape.Textures= true;
      a3dshape.ProcessAll();
MAX maxmodel = new  MAX();
        maxmodel.Textures= false;
        maxmodel.ProcessAll();

    }
}
