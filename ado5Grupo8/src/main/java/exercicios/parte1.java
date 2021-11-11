/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import java.util.Scanner;

/**
 *
 * @author João Pablo
 */
public class parte1 {

    /* Utilize a instrução switch e o laço/loop do-while para implementar uma questão de múltipla escolha referente a alguma das outras disciplinas
                que você está cursando neste semestre. Primeiro deverá ser apresentado o enunciado da questão com as 5 opções/alternativas de resposta, 
                que são (a), (b), (c), (d) e (e). Depois que o usuário escolher uma opção, se for a resposta correta deverá ser impresso “Resposta correta”, 
                caso contrário “Resposta incorreta”. No caso de “Resposta incorreta” a questão deve ser apresentada novamente para outra tentativa.
                Deve ser permitido no máximo 3 tentativas, quando a resposta correta for escoeve ser permitido no máximo 3 tentativas, lhida deve ser informado em qual tentativa isso ocorreu,
                caso isso não ocorra em nenhuma das 3 tentativas deve ser impresso “Resposta incorreta nas 3 tentativas”.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tentativas = 3;
        String res;
        
        System.out.println("----Responda essa questão----");
        
        do{
          System.out.println("A respeito dos conjuntos numéricos, de suas definições e das relações de inclusão\n"
                + "existentes entre eles, assinale a alternativa verdadeira:");
        System.out.println("(A) O conjunto dos números naturais é formado pelos números inteiros positivos.\n"
                + "(B) O conjunto dos números inteiros é formado por todos os números inteiros positivos e negativos.\n"
                + "(C) O conjunto dos números racionais contém o conjunto dos números reais.\n"
                + "(D) O conjunto dos números inteiros contém o conjunto dos números naturais.\n"
                + "(E) O conjunto dos números reais é disjunto do conjunto dos números racionais.");  
          res = input.next();  
            switch (res) {
                case "A":
                    System.out.println("Resposta correta");
                    break;
                case "B": 
                    System.out.println("Resposta incorreta");
                    tentativas --;
                    break;
                case "C":
                    System.out.println("Resposta incorreta");
                    tentativas --;
                    break;
                case "D":
                    System.out.println("Resposta incorreta");
                    tentativas --;
                    break;
                case "E":    
                    System.out.println("Resposta incorreta");
                    tentativas --;
                    break;
                default:
                    System.out.println("Opção invalida");
                    
            }
            
        }
        while (tentativas > 0);
            System.out.println("1");
    }

}
