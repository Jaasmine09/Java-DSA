/* Write a program to print the multiplication table of a number N, entered by the
user. */

import java.util.*;
public class problem4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n =sc.nextInt();
        
        for(int i=0; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n*i);
        }
        
    }
    
}
