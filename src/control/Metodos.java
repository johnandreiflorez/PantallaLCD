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
}
