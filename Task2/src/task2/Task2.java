/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

/**
 *
 * @author 19301261
 */
import java.util.Scanner;
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       String b=sc.nextLine();
       for (int i=0;i<b.length();i++){
           System.out.println(b.charAt(i));
       }
    }
    
}
