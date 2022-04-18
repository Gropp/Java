/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao02;

/**
 *
 * @author gropp
 */
public class TesteFuncao02 {

    /**
     * @param args the command line arguments
     */
    // mais é publico - qualquer um pode acessar
    // static quer dizer que vc pode utilizar sem instanciar
    // void é um procedimento, nao retorna nada
    // o parametro é uma variavel - array de strings chamada "args"
    public static void main(String[] args) {
        // TODO code application logic here
        // chamada do metodo contador feito na classe operacoes.java
        System.out.println("O programa comeca no main()");
        System.out.println("Chamando o metodo contador:");
        System.out.println(Operacoes.contador(1,5)); //vai chamar a funcao e mostrar na tela
    }
    
}
