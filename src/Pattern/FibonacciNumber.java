package Pattern;

import java.util.Scanner;

public class FibonacciNumber {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int i ;
        int sum;
        int a=0;
        int b=1;
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        for (i=0;i<n-2;i++){
            sum=a+b;
            System.out.print(sum);
            a=b;
            b=sum;
            System.out.print(" ");
        }
    }
}
