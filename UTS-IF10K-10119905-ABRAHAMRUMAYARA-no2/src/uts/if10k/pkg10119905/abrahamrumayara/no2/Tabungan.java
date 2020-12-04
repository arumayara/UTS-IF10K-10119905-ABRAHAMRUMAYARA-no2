/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119905.abrahamrumayara.no2;

/**
 *
 * @author 
 * Nama: Abraham Rumayara
 * Kelas : IF10K
 * NIM : 10119905
 * UTS no 2. Tabungan
 */
public class Tabungan {
    
    private int saldo;
    
    public Tabungan(int saldo){
        this.saldo=saldo;
    }
    
    public int ambilUang(int Jumlah){
        this.saldo = saldo;
        saldo = saldo-Jumlah;
         return saldo;
    }
}

