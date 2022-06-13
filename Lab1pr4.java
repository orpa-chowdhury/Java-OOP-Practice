
package lab1pr4;

import java.util.Scanner;


public class Lab1pr4 {
    
    public int isPrime(int n){
        if(n == 1){
            return 0;
        }
        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return 0;
            }
        }
        return 1;
    }
    
    public int nextPrime(int n){
        Lab1pr4 obj = new Lab1pr4();
        
        while(true){
           int r = obj.isPrime(n); 
           if(r == 0){
               n = n + 1;   
           }
           else{
               return n;
           }
        }
        
    }

    public static void main(String[] args){
        
        Lab1pr4 obj = new Lab1pr4();
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        System.out.print("nextPrime("+n+") -> ");
        int result = obj.nextPrime(n);
        System.out.println(result);
    }

}
