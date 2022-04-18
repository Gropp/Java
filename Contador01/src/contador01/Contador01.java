/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contador01;

/**
 *
 * @author gropp
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 0;
        while (cc<20) {
            cc++;
            //Quando o numero for impar ele interrompe o loop e nao imprime!
            //e o continue faz o loop voltar ao inicio.
            //pode-se interromper o fluxo de varias formas com continue!
            if (cc%2 != 0) {
                continue;
            }
            //Quando se utiliza o brake, diferente do continue, ele quebra o laco, faz o programa sair do loop!
            if (cc == 12) {
                break;
            }
        System.out.println("CAMBALHOTA " + cc);        
        }
    }
    
}
