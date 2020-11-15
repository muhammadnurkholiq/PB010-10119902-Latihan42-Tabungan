/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pb010.pkg10119902.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Muhammad Nurkholiq
 * KELAS    : IF10K
 * NIM      : 10119902
 * Deskripsi Program    : Program Ini Berisi Program Untuk Menampilkan Tabungan
 * 
 */

public class PB01010119902Latihan42Tabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner input = new Scanner(System.in);

        System.out.println("==== Program Penarikan Uang ====");
        System.out.print("Masukan saldo Awal : ");
        Tabungan tbg = new Tabungan(input.nextInt());
        System.out.print("Jumlah uang yang diambil : ");
        int jumlah = input.nextInt();
        System.out.println("Saldo anda sekarang : "+tbg.ambilUang(jumlah));
    }
    
}
