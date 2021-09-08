package Pattern;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i = 1;
        int c = 1;
        while (i<=4){
            int j=1;
            while (j<=i){
                System.out.print(c);
                c++;
                j++;

            }
            System.out.println("");
            i++;

        }

    }
}
