
package lab1pr5;

import java.util.Scanner;


public class Lab1pr5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = input.nextInt();
        System.out.println("\nInput second number: ");
        int b = input.nextInt();
        int c = a * b;
        System.out.println(a + " x " + b + " = " +c);
        
    }
}
