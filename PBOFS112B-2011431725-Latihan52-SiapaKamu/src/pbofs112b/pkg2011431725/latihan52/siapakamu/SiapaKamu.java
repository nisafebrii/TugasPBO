/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbofs112b.pkg2011431725.latihan52.siapakamu;

/**
 *
 * @author nisaf
 * Nama        : Nisa Febriyani
 * Kelas       : PBO FS112B
 * NIM         : 2011431725
 * Deskripsi Program : Program ini berisi untuk menampilkan Siapa Kamu
 */
public class SiapaKamu {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dosen d = new Dosen();
        Mahasiswa mhs = new Mahasiswa();
        
        d.setNip("41227829930");
        d.setNama("Rizki Adam Kurniawan");
        d.setUmur(27);
        d.setMataKuliah("PBO");
        System.out.println("NIP DOSEN : " + d.getNip());
        d.siapaKamu();
        d.mengajarApa();
        System.out.println();
        
        mhs.setNim("2011431725");
        mhs.setNama("Nisa Febriyani");
        mhs.setUmur(20);
        mhs.setKelas("FS112B");
        System.out.println("NIM MAHASISWA : " + mhs.getNim());
        mhs.siapaKamu();
        mhs.kelasApa();
    }
}
