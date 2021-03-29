package pbofs112b.pkg2011431725.latihan56.umurbarangantik;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nisaf
 * Nama        : Nisa Febriyani
 * Kelas       : PBO FS112B
 * NIM         : 2011431725
 * Deskripsi Program : Program ini berisi untuk menampilkan umur dari barang antik
 */
public class BarangAntik {
   int umur;
   
   public BarangAntik (int umur) {
       this.umur = umur;
   }
   public void tampilUmur () {
       Radio r = new Radio(234);
        System.out.println("Umur barang antik ini adalah    : " + umur + " tahun ");
   }
}
