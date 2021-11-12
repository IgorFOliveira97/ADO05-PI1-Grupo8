/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Random;

/**
 *
 * @author OLIVEIRA
 */
public class PARTE2 {

    public static void main(String[] args) {
        Random aleatorio = new Random();
        int valor;
        int um = 0,dois =0,tres=0,quatro=0,cinco=0,seis=0;

        for (int i = 1; i<=100; i++) {
            valor = aleatorio.nextInt(6) + 1;
            System.out.println("numero gerado: " + valor);
            if(valor == 1){
                um++;
            }else if(valor == 2){
                dois++;
            }else if(valor == 3){
                tres++;
            }else if(valor == 4){
                quatro++;
            }else if(valor == 5){
                cinco++;
            }else if(valor == 6){
                seis++;
            }
        }System.out.println("O valor de 1 aparece: " + um + " veze");
        System.out.println("O valor de 2 aparece: " + dois + " vezes");
        System.out.println("O valor de 3 aparece: " + tres + " vezes");
        System.out.println("O valor de 4 aparece: " + quatro + " vezes");
        System.out.println("O valor de 5 aparece: " + cinco + " vezes");
        System.out.println("O valor de 6 aparece: " + seis + " vezes");
    }
}
