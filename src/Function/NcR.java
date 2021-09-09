package Function;

import java.util.Scanner;

public class NcR {
    public static int fact(int n){
        int f=1;
        int i;
        for (i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int r=s.nextInt();
        int num=fact(n);
        int d1=fact(r);
        int d2=fact(n-r);
        int sol=num/(d1*d2);
        System.out.println(sol);


    }
}
