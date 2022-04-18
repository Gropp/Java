/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposconversao;

/**
 *
 * @author gropp
 */
public class TiposConversao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = 30;
        String valor = Integer.toString(idade);
        String str = String.valueOf(idade);
        System.out.printf("Os valores são %s e %s \n",valor, str);
        String custo = "40";
        int preco = Integer.valueOf(custo);
        int preco2 = Integer.parseInt(custo);
        System.out.println(preco);
        System.out.println(preco2);
        String real = "34.40";
        float preco3 = Float.valueOf(real);
        float preco4 = Float.parseFloat(real);
        System.out.println(preco3);
        System.out.println(preco4);
    }    
}
