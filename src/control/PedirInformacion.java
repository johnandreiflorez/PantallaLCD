/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import javax.swing.JOptionPane;
import modelo.Numero;

/**
 *
 * @author jaflorez
 */
public class PedirInformacion {
    private  Numero [] numeros;
    public PedirInformacion() {
    }
    public void obtenerInfo ( ){
        int tamaño=0;
        String numero="";
        ValidacionGeneral objGeneral = new ValidacionGeneral();
        boolean sw=true;
        do{
            do{
                do{
                    numero=JOptionPane.showInputDialog("Ingrese el tamaño de los numeros: ");
                    sw=objGeneral.esNumeroEntero(numero);
                    if(sw){
                        tamaño = Integer.parseInt(numero);
                    }
                }while (!sw);
                if(tamaño<0||tamaño>10)
                    JOptionPane.showMessageDialog(null, "Error, el numero ingresado no es permitodo vuelve a intentar. \n 1-10");
            }while(tamaño<0||tamaño>10);
            do{
                numero = JOptionPane.showInputDialog("Ingrese el numero: ");
                sw = objGeneral.esNumeroEntero(numero);
            }while(!sw);
            
            numeros = new Numero [numero.length()];
            Numero objNumero= new Numero();
            for(int i=0;i<numero.length();i++){
                objNumero = clasificar(String.valueOf(numero.charAt(i)));
                 numeros[i]=objNumero;
            }
            Metodos objMetodos = new Metodos();
            System.out.print(" ");
            for(int i=0; i<numero.length(); i++)
                objMetodos.llenarHorizontal(tamaño,numeros[i].isCabeza());
            System.out.println("");
            for(int k=0; k<tamaño;k++){
                for(int i=0;i<numero.length();i++)
                    objMetodos.llenarLateralInferior(tamaño,numeros[i].getLateralesSuperior());
                System.out.println("");
            }
            System.out.print(" ");
            for(int i=0; i<numero.length(); i++)
                objMetodos.llenarHorizontal(tamaño,numeros[i].isCentro());
            System.out.println("");
            for(int k=0; k<tamaño;k++){
                
                for(int i=0;i<numero.length();i++)
                    objMetodos.llenarLateralInferior(tamaño,numeros[i].getLateralesInferior());
                System.out.println("");
            }
            System.out.print(" ");
            for(int i=0; i<numero.length(); i++)
                objMetodos.llenarHorizontal(tamaño,numeros[i].isBase());
            System.out.println("");
        }while(tamaño!=0 || !numero.equals("0"));
    }
    public Numero clasificar(String numero){
        Numero num=new Numero();
        switch(numero){
            case"0":
                num=new Numero(101, 101, true, false,true);
                break;
            case"1":
                num=new Numero(001, 001, false, false,false);
                break;
            case"2":
                num=new Numero(001, 100, true, true,true);
                break;
            case"3":
                num=new Numero(001, 001, true, true,true);
                break;
            case"4":
                num=new Numero(101, 001, false, true,false);
                break;
            case"5":
                num=new Numero(100, 001, true, true,true);
                break;
            case"6":
                num=new Numero(100, 101, true, true,true);
                break;
            case"7":
                num=new Numero(001, 001, true, false,false);
                break;
            case"8":
                num=new Numero(101, 101, true, true,true);
                break;
            case"9":
                num=new Numero(101, 001, true, true,true);
                break;
            default:
                JOptionPane.showConfirmDialog(null, "Error. un caracter no es Numero");
                break;
        }
       return num;
    }
    public Numero[] getNumeros() {
        return numeros;
    }
}
