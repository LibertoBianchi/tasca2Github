package com.jaume.penjat;

public class Tauler {
    private int intents;
    private char[] paraulaSecreta;
    private String[] palabraEndevinada;

    public String[] getPalabraEndevinada() {
        return palabraEndevinada;
    }

    public void setPalabraEndevinada(String[] palabraEndevinada) {
        this.palabraEndevinada = palabraEndevinada;
    }

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
        //PalabraEndevinada
        setPalabraEndevinada(new String[paraula.length()]); //mismas posicines que paraula, inicializado para toda la clase

        setIntents(i);
    }
    public String verificar(String lletra) {
        if (lletra.length() > 1) {
            return "Lletra incorrecte";
        }
        boolean fallo = true;       // necesario para restar un intento y que no te rese por caracter incorrecto

        for (int i = 0; i < paraulaSecreta.length; i++) {
                if (Character.toString(paraulaSecreta[i]).equals(lletra)) {   //pasar paraulaSecreta a String para que lo reconozca equals
                        palabraEndevinada[i] = lletra;
                        fallo = false;                                         //pongo un primer estado boolean de referencia a cuando acierta
                };
        }
        if (fallo){
            intents--;                                                         //resto 1 intento al ser el caso contrario
        }
        return "";
    }
    public String imprimir(){
       String contiene = "";
        for (int i = 0; i < palabraEndevinada.length; i++) {
            //if (palabraEndevinada[i].equals("")){}
            if(palabraEndevinada[i] == null) {
                contiene += "_";
            }else{
                contiene += palabraEndevinada[i];
            }
        }return contiene;
    };

    //public int imprimirVides(){}

}