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
public class parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random aleatorio = new Random();
        int valor;
        float um = 0, dois = 0, tres = 0, quatro = 0, cinco = 0, seis = 0;

        for (int i = 1; i <= 1000000; i++) {
            valor = aleatorio.nextInt(6) + 1;
            System.out.println("numero gerado: " + valor);
            if (valor == 1) {
                um++;
            } else if (valor == 2) {
                dois++;
            } else if (valor == 3) {
                tres++;
            } else if (valor == 4) {
                quatro++;
            } else if (valor == 5) {
                cinco++;
            } else if (valor == 6) {
                seis++;
            }
        }
        float porcentagem1 = um * 100 / 1000000;
        float porcentagem2 = dois * 100 / 1000000;
        float porcentagem3 = tres * 100 / 1000000;
        float porcentagem4 = quatro * 100 / 1000000;
        float porcentagem5 = cinco * 100 / 1000000;
        float porcentagem6 = seis * 100 / 1000000;
        float total = porcentagem1 + porcentagem2 + porcentagem3 + porcentagem4 + porcentagem5 + porcentagem6;
        System.out.println("O valor de 1 aparece: " + um + " veze");
        System.out.printf("A porcentagem de vezes que o valor 1 aparece é de %.2f \n", porcentagem1);
        System.out.println("O valor de 2 aparece: " + dois + " vezes");
        System.out.printf("A porcentagem de vezes que o valor 2 aparece é de %.2f \n", porcentagem2);
        System.out.println("O valor de 3 aparece: " + tres + " vezes");
        System.out.printf("A porcentagem de vezes que o valor 3 aparece é de %.2f \n", porcentagem3);
        System.out.println("O valor de 4 aparece: " + quatro + " vezes");
        System.out.printf("A porcentagem de vezes que o valor 4 aparece é de %.2f \n", porcentagem4);
        System.out.println("O valor de 5 aparece: " + cinco + " vezes");
        System.out.printf("A porcentagem de vezes que o valor 5 aparece é de %.2f \n", porcentagem5);
        System.out.println("O valor de 6 aparece: " + seis + " vezes");
        System.out.printf("A porcentagem de vezes que o valor 6 aparece é de %.2f \n", porcentagem6);
        System.out.printf("total da porcentagem: %.2f " , total);
    }

}
