/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resolucaotela;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author gropp
 */
public class ResolucaoTela {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit res = Toolkit.getDefaultToolkit();
        Dimension d = res.getScreenSize();
        System.out.println("A resolução da tela de sua máquina é: " +d.width + " x " +d.height);
    }
    
}
