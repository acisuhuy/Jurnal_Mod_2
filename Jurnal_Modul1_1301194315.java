/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jurnal.modul.pkg1301194315;

/**i
 *
 * @author zaky
 */
import java.util.Scanner;

public class Jurnal_Modul1_1301194315 {
   
       
    public static void main(String[] args){
    System.out.print("Nama: Zaky Mahfudz Pasha");
    System.out.print("NIM: 1301194315");
    System.out.print("Kelas: FIF-43-06");
    int i, j, f, g;
    int matriks_normal[][] = new int[8][8]; 
    int transpose[][] = new int[8][8];
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan jumlah baris matriks: ");
    f = scan.nextInt();
    System.out.print("Masukkan jumlah kolom matriks: ");
    g = scan.nextInt();
    System.out.println("Masukkan elemen matriks: ");
    for(i = 0; i < f; i++){
      for(j = 0; j< n; j++){
        matriks_normal[i][j] = scan.nextInt();
      }
    }
    for(i = 0; i < f; i++){
      for(j = 0; j< g; j++){
        transpose[j][i] = matriks_normal[i][j];
      }
    }
    System.out.println("Hasil transpose matriks: ");
    for(i = 0; i < g; i++){
      for(j = 0; j< f; j++){
        System.out.print(transpose[i][j] + "\t");
      }
      System.out.println();
    }
  }
}