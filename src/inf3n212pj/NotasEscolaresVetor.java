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
public class NotasEscolaresVetor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leia = new Scanner(System.in);
        float notas[] = new float[5];
        int contnotas;
        System.out.println("Digite quantas notas quer vizualizar: ");
        contnotas = leia.nextInt();
       
        System.out.println("--Notas Escolares--");
        for (int i = 1; i < (contnotas+1); i++) {//para do portugol
            do{//faça enquanto no portugol
                System.out.print("Digite a " + (i + 1) + "ª nota: ");
                notas[i] = leia.nextInt();
                if(validaNota(notas[i])){//"||" pipe é or e "&&" é and
                    System.out.println("Nota inválida!");
                }                  
            }while (validaNota(notas[i]));//Fim do "do"
            notas[i] += notas[i];                        
        }//Fim do "for"
            notas[1] = notas[0]/4;
            System.out.print("Sua média foi de: " + notas[1]);
            if(notas[1] >= 7){
                System.out.println(", Parabéns você foi aprovado.");
            
            }else{
                System.out.println(", infelizmente você não aprovou, seu BURRO!");
            }
    }
    public static boolean validaNota(float nota){
        return nota < 0 || nota > 10;        
    }//Fim do "validaNota"
    public static float leiaFloat(){
         try{//Try é como se fosse o "if"
            Scanner leia = new Scanner(System.in);
            return leia.nextFloat();
        }catch(Exception e){
             System.out.println("Erro:" + e.getMessage());
             System.out.println("Tente novamente: ");
             return leiaFloat();
        }
        
    }//Fim do "leiaFloat"
}
