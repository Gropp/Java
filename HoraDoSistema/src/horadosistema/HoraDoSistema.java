/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horadosistema;

import java.util.Date;

/**
 *
 * @author gropp
 */
public class HoraDoSistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date relogio = new Date(); /*relogio é um objeto criado com o comando new */
        System.out.print("A Hora do sistema é: ");
        System.out.println(relogio.toString()); /*metodo que converte o objeto relogio para uma string*/
    }
    
}
