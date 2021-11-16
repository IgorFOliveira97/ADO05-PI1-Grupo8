/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author João Pablo
 */
public class parte3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int chute = 0,
                sorteado,
                tentativas = 1;

        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        sorteado = rand.nextInt(100) + 1;
        System.out.println("Adivinhe qual o Número entre 1 e 100");
        System.out.println(sorteado);

        do {
            System.out.println("Número de tentativas: " + tentativas);

            System.out.println("Qual seu palpite: ");
            chute = input.nextInt();

            tentativas++;
            if (chute == sorteado + 1 || chute == sorteado - 1) {
                System.out.println("TÁ QUENTE!!!");
            } else {
                if (chute != sorteado && chute > sorteado) {
                    System.out.println("O seu chute é maior que o número");
                } else if (chute != sorteado && chute < sorteado) {
                    System.out.println("O seu chute é menor que o número");
                }
            }
        } while (chute != sorteado && tentativas < 6);
        if (tentativas == 6) {
            System.out.println("GAME OVER!!!");
            System.out.println("O número sorteado era: " + sorteado);
        } else {
            System.out.println("Parabéns, você ganhou o jogo!");
        }
    }
    
}
