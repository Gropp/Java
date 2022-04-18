/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author gropp
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float nota = 8.5f; //tipado com f no final
        float nota2 = (float) 5.4; //fortemente tipado
        String nome = "Fernando";
        System.out.print("A primeira nota é: " + nota); //imprime sem pular linha
        System.out.println("A segunda nota é: " + nota2); //imprime pulando linha
        System.out.printf("A nota do %s é %.2f \n", nome, nota); //formata a saida
        System.out.format("A nota do %s é %.1f \n", nome, nota2); //formata a saida
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String user = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota3 = teclado.nextFloat(); // digitar com "virgula"
        System.out.format("A nota do %s é %.2f \n", user, nota3); //formata a saida
        System.out.print("Digite a idade do aluno: ");
        int idade = teclado.nextInt();
        System.out.format("A idade do %s é %d anos \n", user, idade); //formata a saida
        //Biblioteca Math
        System.out.print("Digite um valor real: ");
        float valor = teclado.nextFloat();
        int piso = (int) Math.floor(valor);
        int teto = (int) Math.ceil(valor);
        int arred = (int) Math.round(valor);
        System.out.format("O Valor piso é %d, o valor teto é %d, e o arredondamento é %d \n", piso, teto, arred);
        //O RANDOMICO SEMPRE É UM DOUBLE DE 0 A 1
        double ran = Math.random();
        //PARA ALTERAR O INTERVALO DO RANDOMICO, VC PODE MATEMATICAMENTE MANIPULAR ESSE RESULTADO
        int li = 5; // LIMITE INFERIOR
        int ls = 10; // LIMITE SUPERIOR
        int ran1 = (int) (li + ran * (ls - li)); // FORMULA PARA GERAR RANDOMICOS EM OUTROS INTERVALOS
        System.out.println(ran1);
                
    }
    
}
