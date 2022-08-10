package com.mycompany.atividade1;

import java.util.Scanner;
public class Atividade1 {

    public static void main(String[] args) {
        int op;
        double n1, n2 ;
        double soma, subtracao, multiplicacao, divisao, quadrado ;
        
         Scanner entrada = new Scanner(System.in);
        do{
        System.out.println("[1] SOMAR");
        System.out.println("[2] SUBTRAIR");
        System.out.println("[3] MULTIPLICAR");
        System.out.println("[4] DIVIDIR");
        System.out.println("[5] QUADRADO");
        System.out.println("[0] FINALIZAR");
        System.out.println(">>>>DIGITE SUA OPÇÃO: ");
        op = entrada.nextInt();
         }while(op >=6);
         
        if(op ==0){
            System.out.println("Programa encerrado");
        }
        
        else{
            
        
    }
        
        System.out.println("Informe o primeiro valor:");
        n1 = entrada.nextDouble();
       System.out.println("Informe o segundo valor:");
        n2 = entrada.nextDouble();
        
        switch(op){
           
            case 1:
                soma = n1+n2;
                System.out.println("A sua soma deu: " +soma);
                
                break;
                
            case 2:
                subtracao = n1-n2;
                System.out.println("A sua subtração deu: "+subtracao);
                break;
                
            case 3:
                multiplicacao = n1*n2;
                System.out.println("A sua multiplicação deu: " +multiplicacao);
                break;
            
                
            case 4:
                if(n1<n2){
                    System.out.println("Impossivel realizar o calculo");               
                }
                
                else{
                   divisao = n1/n2;
                     System.out.println("A divisão é: " +divisao);
                
                        } 
                
                
                break;
                
            case 5:
                quadrado = n1*n1;
                System.out.println("O numero ao quadrado é: " +quadrado);
            
                break;
                
             
  
                    
        
       
        }
            
                
                        
               
               
                       
    }
}
