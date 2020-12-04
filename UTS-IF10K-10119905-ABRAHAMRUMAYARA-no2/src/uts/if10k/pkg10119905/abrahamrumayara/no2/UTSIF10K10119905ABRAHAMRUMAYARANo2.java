/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119905.abrahamrumayara.no2;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama: Abraham Rumayara
 * Kelas : IF10K
 * NIM : 10119905
 * UTS no 2. Tabungan
 */
public class UTSIF10K10119905ABRAHAMRUMAYARANo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Saldo = 0;

        Scanner input = new Scanner(System.in);        
        System.out.println("=== Program Penarikan Uang ===");
        System.out.println("Masukan Saldo : ");
        Tabungan objTabungan = new Tabungan(input.nextInt());
        System.out.println("Jumlah Uang yang diambil : ");
        objTabungan.ambilUang(input.nextInt());
        System.out.println("Saldo anda sekarang : "+ objTabungan.ambilUang(Saldo));

    }
    
}
