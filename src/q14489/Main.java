package q14489;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextInt();
        long B = sc.nextInt();
        long C = sc.nextInt();
        sc.close();

/*        System.out.println(A + B);
        System.out.println(C);*/
        if(A+B>=2*C){
          System.out.println(A+B-2*C);
        }else{
            System.out.println(A+B);
        }
    }
}
