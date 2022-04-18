/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package funcao01;

/**
 *
 * @author gropp
 */
public class Funcao01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // instanciar a classe fatorial criada no projeto
        Fatorial f = new Fatorial();
        //chamar o metodo criado setValor dentro de Fatorial.java passando 5 de parametro
        f.setValor(5);
        //chama as duas classes que devolvem o valor do fatorial e a formula
        System.out.print(f.getFormula());
        System.out.println(String.format("%.0f", f.getFatorial()));
    }
    
}
