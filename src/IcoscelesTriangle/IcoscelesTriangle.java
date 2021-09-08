package IcoscelesTriangle;

import java.util.Scanner;

public class IcoscelesTriangle {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int i=1;
        while(i<=n){
            int space = 1;
            while(space<=n-i){
                System.out.print(" ");
                space++;
            }
            int c=1;
            int j=1;
            while (j<=i){
                System.out.print(c);
                c++;
                j++;
            }
            c=c-2;
            int k=1;
            while(k<=i-1){
                System.out.print(c);
                k++;
                c--;
            }
            System.out.println();
            i++;
        }
    }
}
