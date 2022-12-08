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
public class CalcMC {
     /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in); 
        float imc, peso, altura;
        String classificacao;
        System.out.println("--Calculadora IMC--");
        System.out.println("Digite o peso: ");
        peso=leia.nextFloat();
        System.out.println("Digite a altura: ");
        altura=leia.nextFloat();
        
        imc = peso/(altura * altura);
        System.out.println("Seu IMC é de: " + imc);
        System.out.printf("Sua média foi de: %.2f ",imc);
        System.out.println("");
        if(imc<=18.5){
            classificacao = "Abaixc do peso!";
        }else if(imc<=24.9){
            classificacao= "Peso ideal!";  
        }else if(imc<=29.9){
            classificacao= "Levemente acima do peso!";
        }else if(imc<=34.9){
            classificacao= "Obesidade grau I!";
        }else if(imc<=39.9){
            classificacao= "Obesidade grau II!";
        }else{
            classificacao= "Obesidade grau III!";
        }         
        System.out.println("Sua classificacao é de" + classificacao);  
    }
}
