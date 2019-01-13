/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CS285.A2;

/**
 *
 * @author turki
 */
public class Q3 {
    static int count = 0;
    public static int count(int x) {
        if (x == 5) {
            return 1;
        } else if (x == 10) {
            return 2;
        } else {
            return count(x - 5) + count(x - 10);
        }
    }

    public static void main(String[] args) {
        System.out.println("Coin question: " + count(45));
        System.out.println("Hanoi question: "+ move(4));
    }
    
    
    public static int move(int n){
         if (n==1) {
            return 2;
        } else { 
             return(3*(move(n-1))+2);
         }
    
    }
    
}
