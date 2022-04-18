/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author gropp
 */
public class TesteFuncao01 {
    
    //procedimento, é void, pois nao precisa de tipo para retorno.
    //main é estatico, entao o nosso procedimento tambem tem que ser static.
    static void soma (int a, int b){
        int s = a + b;
        System.out.println(s);
    }

    //funcao - tem que ser tipada, pois retorna alguma coisa
    //a variavel local nao é vista pelo main;
    static int multiplica (int a, int b){
        int m = a * b;
        return m; //devolve o resultado para quem chamou a funcao
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //chamada do procedimento
        soma(5,2);
        int resultado = multiplica(5,2);
        System.out.println(resultado);
    
    }
    
}
