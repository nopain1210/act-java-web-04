/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class bai61 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, lcm;
        System.out.println("Nhap vao hai so a,b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == b) {
            System.out.println("UCLN la chinh no");
        }
        int temp1 = a, temp2 = b;
        while (temp1 != temp2) {
            if (temp1 > temp2) {
                temp1 = temp1 - temp2;
            } else {
                temp2 = temp2 - temp1;
            }
        }
        int bcnn = temp1;
        System.out.println("UCLN la: " + temp1);
        System.out.println("BCNN la: " + (a * b) / bcnn);
        // TODO code application logic here
    }
    
}
