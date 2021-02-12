package com.jaume.penjat;

public class Tauler {
    private int intents;
    private char[] paraulaSecreta;
    public String lletra;

    public char[] getParaulaSecreta() {
        return paraulaSecreta;
    }

    public void setParaulaSecreta(char[] paraulaSecreta) {
        this.paraulaSecreta = paraulaSecreta;
    }




    public int getIntents() {
        return intents;
    }

    public void setIntents(int intents) {
        this.intents = intents;
    }

    public void inicialitzarPartida(String paraula, int i) {
        setIntents(i);
    }
    public String verificar(String lletra) {
        if (lletra.length() > 1) {
    return "Lletra incorrecte";
        }
        return "";
    }


}