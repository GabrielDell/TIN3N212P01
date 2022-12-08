/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inf3n212pj;

import java.text.DateFormat;
import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author 182120002
 */
public class Diasvida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner leia = new Scanner(System.in);
       int idade, ano = 365;
       System.out.println("--Calculadora de dias de vida--");
       System.out.println("Insira sua idade: ");
       idade = leia.nextInt();
       System.out.println("Sua dias vividos é : " + (idade * ano) );
       LocalDate dtNasc, dAtual = LocalDate.now();
      
    }
    
}
