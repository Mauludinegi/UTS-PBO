/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IV.BilanganGenap;

/**
 *
 * @author GIE
 */
public class BilanganGenap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(var counter = 1; counter <= 100; counter++){
            if(counter % 2 == 0){
                System.out.println("Perulangan genap " + counter);
            }

        }
    }
    
}
