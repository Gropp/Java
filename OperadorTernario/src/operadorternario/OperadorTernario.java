/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author gropp
 */
public class OperadorTernario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int n1, n2, r;
        n1 = 14;
        n2 = 8;
        r = (n1>n2)?n1+1:n2; //o operador ternario ainda aceita calculos dentro da "resposta"
        System.out.println(r);
        //operadores relacionais
        String nome1 = "Fernando";
        String nome2 = "Fernando";
        String nome3 = new String("Fernando"); //Tipo instanciado
        String res; //Declara o objeto res, sem instanciar
        res = (nome1==nome2)?"IGUAL":"DIFERENTE";
        System.out.println(res);
        res = (nome1==nome3)?"IGUAL":"DIFERENTE";
        System.out.println(res);
        res = (nome1.equals(nome3))?"IGUAL":"DIFERENTE"; //usando o metodo equal se testa o conteudo e nao a estrutura do objeto!
        System.out.println(res);
    }
    
}
