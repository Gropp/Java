/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repeticaofor;

/**
 *
 * @author gropp
 */
public class RepeticaoFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // forma mais rapida de fazer loop
        for(int cc = 0; cc <= 10; cc++){ //cc++; cc+=2; cc-=2; ... 
            System.out.println("Cambalhota");
            System.out.println(cc);
        }
        for(int i=1; i<3; i++){
            for(int j=0; j<=2; j+=2){
                System.out.println(i+" "+j);
            }
        }
    }
    
}
