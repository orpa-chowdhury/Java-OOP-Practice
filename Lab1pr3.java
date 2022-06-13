
package lab1pr3;

import java.util.Scanner;


public class Lab1pr3{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int n;
        System.out.print("gcd("+ a +","+ b +") -> ");
        if(a > b){
            n = a;
        }
        else{
            n = b;
        }
        int gcd = 1;
        for(; n > 1; n--){
            if(a % n == 0 && b % n == 0){
                gcd = n;
                break;
            }
            
        }
        System.out.println(gcd);
        
    }
    
}

