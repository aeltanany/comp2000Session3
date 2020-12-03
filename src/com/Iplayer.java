package com;


public interface Iplayer {
    void AddDisplay(IDisplay Display);

    void RemoveDisplay(IDisplay Display);

    void updateDisplay();

    String getName();

}
