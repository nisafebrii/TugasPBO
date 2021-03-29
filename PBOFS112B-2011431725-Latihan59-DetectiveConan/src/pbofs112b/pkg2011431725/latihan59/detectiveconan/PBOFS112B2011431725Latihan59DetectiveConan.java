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
public class PBOFS112B2011431725Latihan59DetectiveConan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        KarakterUtama conan = new KarakterUtama("Shinichi Kudo", "Detektif", "Memecahkan Kasus", "Detective Cilik" );
        conan.tampilKarakterUtama();
        KarakterUtama ran = new KarakterUtama("Ran Mouri", "Ahli Beladiri", "Ingin menjadi ahli karate", "Detective Cilik");
        ran.tampilKarakterUtama();
        KarakterUtama kagoro = new KarakterUtama("Kagoro Mauri", "Detective Swasta", "Menyelesaikan masalah", "Detective Cilik");
        kagoro.tampilKarakterUtama();
        
        
        KarakterPendukung eri = new KarakterPendukung("Eri Kisaki", "Pengacara", "Istri dari Kogoro Mouri dan Ibunya Ran");
        eri.tampilKarakterPendukung();       
        KarakterPendukung sonoko = new KarakterPendukung("Sonoko Suzuki", "Siswi SMA", "Sahabatnya Ran Mouri");
        sonoko.tampilKarakterPendukung();       
        KarakterPendukung heiji = new KarakterPendukung("Heiji Hattori", "Detektif SMA", "Temannya Conan Edogawa");
        heiji.tampilKarakterPendukung();
        KarakterPendukung kazuha = new KarakterPendukung("Kazuha Tayoma", "Ahli Aikido", "Temannya Ran Mouri dan Suka pada Heiji Hattori");
        kazuha.tampilKarakterPendukung();
        KarakterPendukung agasa = new KarakterPendukung("Hiroshi Agasa", "Profesor","Memberikan bantuan kepada Conan berupa alat dalam memecahkan/menyelesaikan kasus dan kepada Detektif Cilik");
        agasa.tampilKarakterPendukung();
        KarakterPendukung ai = new KarakterPendukung("Ai Haibara/Shiho Miyano", "Peneliti/Detektif Cilik","Memberikan bantuan kepada Conan dan salah satu Detektif Cilik");
        ai.tampilKarakterPendukung();
    }
    
}

