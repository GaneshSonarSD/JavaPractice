package rivisionBasic;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Enter First number: ");
//        int num1 = in.nextInt();
//        System.out.println("Enter second Number:");
//        int num2 = in.nextInt();
//
//        System.out.println(add(num1,num2));
        System.out.println(isPrime(7));
    }
    static int add(int a, int b){
        return a + b;
    }
    static boolean isPrime(int num){
        if(num <=1){
            return false;
        }
        int i = 2 ;
        while(i <= num/2){
            if(num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }

}
