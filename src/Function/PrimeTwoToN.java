package Function;

import java.util.Scanner;

public class PrimeTwoToN {
    public static void PrintPrime(int n){
        int i;
        for(i=2;i<=n;i++){
            boolean print=isprime(i);
            if(print){
                System.out.println(i);
            }
        }
    }public static boolean isprime(int i){
        int j;
        for(j=2;j<(i/2);j++){
            if (i%j==0){
                return false;
            }
        }return true;

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        PrintPrime(num);

    }
}
