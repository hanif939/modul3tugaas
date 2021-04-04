/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searching;
import java.util.Scanner;
/**
 *
 * @author Hanif Bachtiar
 */
public class Searching_binary {
    public static void main(String[] args){
        System.out.println("\t" +"***** BINARY SEARCH*****" +"\n");
        int B[] = {2, 4, 6, 8, 10, 12,14, 16, 18, 20};
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Data Yang Akan Dicari : ");
        int cari = input.nextInt();
        
        int Indeksawal = 0;
        int Indeksakhir = B.length -1;
        int ketemu = 0;
        int point = 0;
        
        System.out.print("Isi Data Adalah : ");
        for (int i = 0; i<B.length; i++){
            System.out.print(B[i] +" ");
        }
        System.out.println("");
        System.out.println("");
        
        while ((Indeksawal <= Indeksakhir) &&(ketemu== 0)){
        point = (Indeksawal + Indeksakhir) / 2;
        System.out.println("Indeks Pointer : "+ point);
        
        if(cari == B[point]){
            ketemu = 1;
            System.out.println("Data " +cari + " Telah Ditemukan pada Indeks ke "+ point);
        }
        else if (cari < B[point]){
        System.out.println("Cari dikiri ");
        Indeksakhir = point - 1;
        }
        
        else {
                Indeksawal = point +1;
                System.out.println("Cari dikanan ");
                }
        }
    if(ketemu == 1)
       System.out.println("Kesimpulan : Data Ditemukan ");
    else
       System.out.println("Kesimpulan : Data Tidak Ditemukan ");
    System.out.println("\n");
    System.out.println("Hanif Bachtiar Martin");
            }
}
