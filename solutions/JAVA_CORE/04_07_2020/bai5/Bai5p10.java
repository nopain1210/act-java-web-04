
package javaapplication1;

import java.util.Scanner;

public class Bai5p10 {
    public static void main(String[] args) {
        System.out.println("Nhap n: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Nhap x: ");
        int x = input.nextInt();
        long m = 1;
        long s = 0;
        for (double i = 1;i <= n;i++){
            m = m * x * x;
            s = s + m;
        }
        System.out.println("Tong S = " +s);
    }
}
