/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;

/**
 *
 * @author gropp
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         //JOptionPane.showMessageDialog(null,"Ola! Mundo", "teste", JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showMessageDialog(null, "teste", "teste", JOptionPane.INFORMATION_MESSAGE);
        //chama o metodo para receber um valor atraves da janela
        int num;
        int cc = 0;
        int s = 0;
        int p = 0;
        int i = 0;
        int c = 0;
        int m = 0;
        
        do{
            //a instrucao html deveria mudar o texto!
            num = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "<html>Informe um numero:<br><em>(valor 0 interrompe!)</em></html>"));
            s += num;
            cc +=1;
            if (num%2 == 0){
                p += 1;
            } else {
                i += 1;
            }
            if (num > 100) c += 1;
            m = (s/cc);
        } while(num!=0);
        //System.out.println(num);
        //mostra o valor em outro painel
        JOptionPane.showMessageDialog(null, "<html>Resultados:<br><hr>" + 
                                            "Total de numeros digitados: " + cc +
                                            "<br> Total dos valores é: " + s +
                                            "<br> Total de pares: "+ p +
                                            "<br> Total de impares: " + i + 
                                            "<br> Maiores que 100: " + c +
                                            "<br> A media dos numeros é: " + m +
                                            "</html>");
    }
    
}
