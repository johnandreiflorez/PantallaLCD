/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
/**
 *
 * @author jaflorez
 */
public class Numero {
    private int lateralesSuperior,lateralesInferior;
    private boolean cabeza,centro,base;

    public Numero(int lateralesSuperior, int lateralesInferior,boolean cabeza, boolean centro, boolean base) {
        this.lateralesSuperior = lateralesSuperior;
        this.lateralesInferior = lateralesInferior;
        this.centro = centro;
        this.base = base;
        this.cabeza=cabeza;
    }
    public Numero() {
    }
    public int getLateralesSuperior() {
        return lateralesSuperior;
    }
    public int getLateralesInferior() {
        return lateralesInferior;
    }
    public boolean isCabeza() {
        return cabeza;
    }
    public boolean isCentro() {
        return centro;
    }
    public boolean isBase() {
        return base;
    }
}
