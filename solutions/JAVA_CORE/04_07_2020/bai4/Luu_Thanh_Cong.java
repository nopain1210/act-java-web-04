/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lession2;

import java.util.Scanner;

/**
 *
 * @author luuthanhcong
 */
public class B4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = n;
        int min = n;
        while(n != 0){
            System.out.println("Nhập n : ");
            n = s.nextInt();
            
            if(n > max)
                n = max;
            
            
            if(n < min && n != 0)
                n = min;
            
        }
        System.out.println("MAX : " + max);
        System.out.println("MIN : " + min);
        
        
    }
}
