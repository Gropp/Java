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
public class Operacoes {
    // funcao (retorna valor tipo string
    // contador de i ate f
    // coloca em uma string a contagem
    // public/private/protected (publico/privado/protegida
    public static String contador(int i, int f) {//aberto ao publico e estatico (nao precisa instanciar para usar)
        String s = "";
        for (int c=1; c<=f; c++) {
            s += c + " ";
        }
        return s;
    }
}
