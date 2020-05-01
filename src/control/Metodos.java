/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import modelo.Numero;

/**
 *
 * @author jaflorez
 */
public class Metodos {

    public Metodos() {
    }
    public void llenarHorizontal(int tamaño,boolean sw){
            if(sw)
                pintarHorizontales(tamaño);
            else
                pintarEspacios(tamaño);
           System.out.print("     ");
    }
    public void llenarLateralInferior(int tamaño ,int lateral){
                if(lateral==1){
                    pintarLineaDerecha(tamaño);
                }else
                    if(lateral==100){
                        pintarLineaIzquierda(tamaño);
                    }else
                        if(lateral==101){
                            pintarLineasLaterales(tamaño);
                        }
    }
    public void pintarEspacios(int tamaño){
        for(int j=0; j<tamaño;j++)
                    System.out.print(" ");
    }
    public void pintarHorizontales(int tamaño){
        for(int j=0; j<tamaño;j++)
                    System.out.print("-");
    }
    public void pintarLineaDerecha (int tamaño){
        for(int j=0; j<tamaño+1;j++)
            System.out.print(" ");
        System.out.print("|   ");
    }
    public void pintarLineaIzquierda (int tamaño){
        System.out.print("|");
        for(int j=0; j<tamaño+4;j++)
            System.out.print(" ");
    }
    public void pintarLineasLaterales (int tamaño){
        System.out.print("|");
        for(int j=0; j<tamaño;j++)
            System.out.print(" ");
        System.out.print("|   ");
    }
    public void rueba (){
        int num = 124357134;
        String numero = String.valueOf(num);
        int aux =0;
        int mayor=0;
        char vect [] = new char [numero.length()];
        for(int i=0; i<numero.length() -1;i++){
            vect[i] = numero.charAt(i);
        }
        for (int i=0; i<numero.length()-1;i++){
            for (int j=0; j<numero.length()-1;j++){
                if(Character.hashCode(vect[j])<Character.hashCode(vect[j+1])){
                    char tmp = vect[j+1];
                    vect[j+1] = vect[j];
                    vect[j] = tmp;
                }
            }
        }
        for (int i=0; i<numero.length()-1;i++){
            System.out.println(vect[i]);
        }
    }
}
