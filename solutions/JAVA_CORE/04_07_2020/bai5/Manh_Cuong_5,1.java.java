/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5;

import java.util.Scanner;

/**
 *
 * @author green
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Nhap so n=");
        float S=1;
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        if(n==1)
        {
            System.out.println(""+S);
        }
        for(int i= 2;i<=n;i++)
        {
            S+=(1/(float)i);
        }
        System.out.println("Tong la: "+S);
    }
    
}
