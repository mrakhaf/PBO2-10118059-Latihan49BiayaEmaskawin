/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118059.latihan49biayaemaskawin;

/**
 *
 * @author 
 * Nama : Muhammad Rakha Firdaus
 * NIM : 10118059
 * Kelas : IF-2
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Emas emas = new Emas();
        
        emas.setBerat(15.7);
        emas.setHarga(570000);
        
        System.out.println("Hendi akan membeli emas kawin sebagai mahar nikahnya");
        System.out.println("dengan total berat " + emas.getBerat() + " gram. Jika 1 gram emas");
        System.out.println("per bulan oktober ini adalah Rp. " + emas.getHarga() + ". Berapa total ");
        System.out.println("bayar yang harus dikeluarkan oleh Hendi?");
        System.out.println("");
        System.out.println("Jawab : ");
        System.out.println("Berat emas untuk mahar nikah : " + emas.getBerat() + " gram");
        System.out.println("Harga emas 1 gram per bulan oktober : Rp. " + emas.getHarga());
        System.out.println("Total harga yang harus dibayar oleh Hendi : Rp. " + emas.totalBayar());
    }
    
}
