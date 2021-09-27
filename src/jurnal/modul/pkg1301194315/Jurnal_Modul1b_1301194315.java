/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal.modul.pkg1301194315;

/**
 *
 * @author zaky
 */
import java.util.Scanner;

public class Jurnal_Modul1b_1301194315 {
    public static void main(String[] args){
public static int[][] line1_1301194104(int[][] a){
        int x_1301194104 = 0;
        int y_1301194104 = 0;
     
        for (int i=0; i<3; i++){
            a[x_1301194104][y_1301194104] = (i+1)*5;
            y_1301194104 += 1;
        }
    return a;
}
    public static void line2_1301194104(int[][] b){
        int x_1301194104 = 1;
        int y_1301194104 = 0;
        
        for(int i=2; i<=10;){
            b[x_1301194104][y_1301194104] = (i);
            y_1301194104 += 1;
            i += 2;
        }
    }    
    public static void line3_1301194104(int[][] c){
        int x_1301194104 = 2;
        int y_1301194104 = 0;
        int faktorial = 1;
        
        for(int i=1; i<5; i++){
            faktorial *= i;
            c[x_1301194104][y_1301194104] = faktorial;
            y_1301194104 += 1;
        }
    }
    public static void line4_1301194104(int[][] d){
        int x_1301194104 = 3;
        int y_1301194104 = 0;
     
        for(int i=3; i<8; i++){
            d[x_1301194104][y_1301194104] = i;
            y_1301194104 += 1;
        }
    }
    
    public static void main(String[] args){
        int arr_1301194104[][] = new int[4][6];
    
        System.out.println("NIM: 1301194104");
        line1_1301194104(arr_1301194104);
        System.out.println("");
        line2_1301194104(arr_1301194104);
        System.out.println("");
        line3_1301194104(arr_1301194104);
        System.out.println("");
        line4_1301194104(arr_1301194104);
        System.out.println("");
    
        int max_1301194104 = 3;
        for(int i=0; i<4; i++){
         for(int j=0; j<max_1301194104; j++){
            System.out.print(arr_1301194104[i][j] + " ");
         }
         max_1301194104 += 1;
         System.out.println("");
        }
    }
}
