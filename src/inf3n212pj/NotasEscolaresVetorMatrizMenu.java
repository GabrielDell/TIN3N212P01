/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.util.Scanner;

/**
 *
 * @author 182120002
 */
public class NotasEscolaresVetorMatrizMenu {
//declaração global 

    static Scanner leia = new Scanner(System.in);
    static String alunos[];
    static float notas[][];
    static int nAlunos, nNotas, contAlunos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//public tem accesso a todo projeto
        // TODO code application logic here
        System.out.println(".:Sistema de Notas:.");
        System.out.println("Informe o núm. de alunos: ");
        nAlunos = (int) leiaFloat();//(int)>cast serviu para ler só números inteiros 
        System.out.println("Quantas notas por aluno: ");
        nNotas = (int) leiaFloat();

        //inicializar vetor e matriz de alunos e notas 
        alunos = new String[nAlunos];
        notas = new float[nAlunos][nNotas + 1];//Por causa da média
        int opM;
        do {
            menu();
            opM = (int) leiaFloat();
            switch (opM) {//escolha do portugol
                case 1:
                    inserirAlunoNotas();
                    break;
                case 2:
                    imprimirAlunosNotas();
                    break;
                case 0:
                    System.out.println("Aplicação encerrada pelo usuário!");
                    break;
                default:
                    System.out.println("Opção inválida,tende novamente!");
                    break;

            }
        } while (opM != 0);

    }//fim main

    public static void menu() {
        System.out.println("1 - Inserir alunos e notas ");
        System.out.println("2 -imprimir alunos e notas");
        System.out.println("0 - Sair");
        System.out.println("Digite aqui:");

    }

    public static float leiaFloat() {
        try {
            Scanner leia = new Scanner(System.in); //Por causa da do leiaFloat
            return leia.nextFloat();
        } catch (Exception e) {
            System.out.println("Tente novamente: ");
            return leiaFloat();
        }
    }//fim do leia float
    private static void inserirAlunoNotas() {//private tem acesso so o programa
        if (contAlunos < nAlunos) {
            System.out.println("Informe o nome do aluno: ");
            alunos[contAlunos] = leia.next();
            for (int i = 0; i < nNotas; i++) {
                System.out.println("Informe a " + (i + 1) + "ª nota: ");
                notas[contAlunos][i] = leiaFloat();
                notas[contAlunos][nNotas] += notas[contAlunos][i];
            }//Fim do for
            notas[contAlunos][nNotas] =  notas[contAlunos][nNotas] / nNotas;
            contAlunos++;
        } else {
            System.out.println("Não é possivel mais digitar alunos."
                    + "\nNúm.máximo de posições obtidos.");
        }
    }

    private static void imprimirAlunosNotas() {
        for (int i = 0; i < contAlunos; i++) {
          System.out.printf(alunos[i] + " sua média foi de %.2f",notas[i][nNotas]);  
          if(notas[i][nNotas] >= 7){
              System.out.println("\nVocê aprovou!");
          }else{
              System.out.println("\nVocê foi reprovado!");
          } 
        }   
    }
}
