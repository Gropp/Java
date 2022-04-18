/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor01;

import java.util.Arrays;

/**
 *
 * @author gropp
 */
public class Vetor01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // todo vetor é um objeto, entao possui metodos
        int n[] = {0,5,7,8}; //cria um vetor n, com esse conteudo; Só de inteiros!
        System.out.println(n.length); //tamanho do vetor
        for(int c=0;c<=n.length-1;c++){
            System.out.println("na posicao "+c+" temos o valor " +n[c]);
        }
        String mes[] = {"jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
        String dias[] = {"31","28","31","30","31","30","31","31","30","31","30","31"};
        for(int i=0;i<mes.length;i++){
            System.out.println(mes[i]+" "+dias[i]);
        }
        //com o for each ele lista todos os dias para cada mes... nao funciona como no exemplo acima
        for(String m : mes){
            for(String d : dias){
                System.out.println(m +" "+ d);
            }
        }
        int num[] = {3,4,2,4,1};
        //Ordena o vetor
        Arrays.sort(num);
        //for each para uso em vetor
        for(int valor: num){
            System.out.println(valor);
        }
        String fruta[] = {"maca", "banana", "uva", "pera"};
        Arrays.sort(fruta);
        for(String fruta1 : fruta) {
            System.out.println(fruta1);
        }
        int busca[] = {1, 5, 4, 6, 4, 3, 8, 9, 7};
        for(int v : busca){
            System.out.println(v);
        }
        //metodo busca binaria dentro do vetor busca
        int pos = Arrays.binarySearch(busca, 8);
        System.out.println(pos);
        
        //cria um vetor vazio de 20 posicoes 0,1,2,3,4,...,19
        int vnum[] = new int[20];
        //preenche todo o vetor com o valor 0, util qdo precisa inicializar um vetor
        Arrays.fill(vnum, 0);
        for(int f : vnum){
            System.out.print(f);
        }
        
        
        
    }
    
}
