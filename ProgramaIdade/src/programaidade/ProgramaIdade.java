/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author gropp
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite a data de seu nascimento: ");
        int nasc = teclado.nextInt();
        int idade = 2021 - nasc;
        System.out.println("Sua idade é: " + idade);
        if (idade>=18) {
            System.out.println("MAIOR DE IDADE!");
        } else {
            System.out.println("MENOR DE IDADE!");
        }
        
    }
    
}
