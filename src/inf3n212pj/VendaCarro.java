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
public class VendaCarro{
    /*
          O custo de um carro novo ao consumidor é a soma do custo de fábrica
          com a porcentagem do distribuidor e dos impostos(aplicados ao custo de
          fábrica). Supondo que o percentual do distribuidor seja de 28% e os 
          impostos de 45%, escrever um algoritmo para ler o custo de fábrica de 
          um carro, calcular e escrever o custo final ao consumidor;
    */
  /**
     * @param args the command line arguments
  */
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        double custoFabrica, valorDistribuidor=0.28, imposto=0.45, valorConsumidor;
        System.out.println("--Sistema de vendas veiculares--");
        System.out.println("Informe o custo de fábrica: ");
        custoFabrica = leia.nextDouble();
        imposto= custoFabrica * 0.45;
        valorDistribuidor = custoFabrica * 0.28;
        valorConsumidor = custoFabrica + valorDistribuidor + imposto;
        System.out.printf("Valor do custo:% .2f\n", valorConsumidor);
        
                
                
        
            
        
        
        
               
          
             
  
    }
}