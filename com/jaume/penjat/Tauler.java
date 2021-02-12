package com.jaume.penjat;

public class Tauler {
    private int intents;

    public int getIntents() {
        return intents;
    }

    public void setIntents(int intents) {
        this.intents = intents;
    }

    public void inicialitzarPartida(String paraula, int i) {
        setIntents(i);
    }


}