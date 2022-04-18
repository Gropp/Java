/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author gropp
 */
public class Fatorial {
    
    //crio as variaveis privadas (so sao vistas dentro da classe fatorial
    private static int num = 0;
    private static float fat = 1;
    private static String formula = "";
    
    //metodos
    
    public static void setValor(int n) { // procedimento (void) recebe n
        num = n; //o num criado fora do procedimento fica em verde! n variavel de transporte local
        float f = 1; // variavel local
        String s = "";
        //calculo do fatorial 5! = 4*3*2*1 = 24
        for(int c=n; c>1;c--) { //contador c, comeca com o valor passado, decrementa e nao pode ser zero
            f *= c;
            s += c + " x ";
        }
        s += "1 = ";
        fat = f;
        formula = s;
    }
    //metodo (funcao - int) publica que ira retornar o fatorial
    public static float getFatorial(){ 
        return fat;
    }
    //metodo (funcao - string) publica que ira retornar o string criado da soluçao
    public static String getFormula(){
        return formula;
    }
    
}
