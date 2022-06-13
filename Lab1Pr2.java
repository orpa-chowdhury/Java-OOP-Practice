package lab1pr2;

import java.util.Scanner;

public class Lab1Pr2{
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a mark between 0 to 100: ");
        int n = input.nextInt();
        
        if(n < 25){
            System.out.println("F");
        }
        else if(n >= 25 && n <= 45){
            System.out.println("E");
        }
        else if(n >= 45 && n <= 50){
            System.out.println("D");
        }
        else if(n >= 50 && n <= 60){
            System.out.println("C");
        }
        else if(n >= 60 && n <= 80){
            System.out.println("B");
        }
        else{
            System.out.println("A");
        }
    }
}
