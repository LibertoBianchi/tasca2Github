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
        paraulaSecreta =new char[paraula.length()];
        // recorrer con un for paraula, de cada [0, 1, 2...] guardarlo dentro del char de palabra secreta
        for (int j = 0; j < paraula.length() ; j++) {
            paraulaSecreta[j] = paraula.charAt(j); //metodo charAt coje caracter por posicion
            System.out.println(paraulaSecreta[j]);
        };
        //forma facil: this.setParaulaSecreta(paraula.toCharArray());

        setIntents(i);
    }
    public String verificar(String lletra) {
        if (lletra.length() > 1) {
    return "Lletra incorrecte";
        }
        return "";
    }


}