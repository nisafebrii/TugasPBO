/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbofs112b.pkg2011431725.latihan59.detectiveconan;

/**
 *
 * @author nisaf
 * Nama        : Nisa Febriyani
 * Kelas       : PBO FS112B
 * NIM         : 2011431725
 * Deskripsi Program : Program ini berisi untuk menampilkan karakter dari animasi detective conan

 */
public class KarakterUtama extends Karakter{
    private String tujuan, tim;
    
    public KarakterUtama(String nama, String peran, String tujuan, String tim) {
        super(nama, peran);
        this.tujuan = tujuan;
        this.tim = tim;
    }
    public String getTujuan() {
        return tujuan;
    }
    public String getTim() {
        return tim;
    }
    public void tampilKarakterUtama() {
        System.out.println("Nama Karakter   : " + getNama());
        System.out.println("Peran           : " + getPeran());
        System.out.println("Tim             : " + getTim());
        System.out.println("Tujuan          : " + getTujuan());
        System.out.println("");
    }
    
}
