/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbofs112b.pkg2011431725.latihan60.akatsuki;

/**
 *
 * @author nisaf
 */
public class Hidan extends Akatsuki{
    private String partnerTim;
    
    public Hidan() {
        this.nama = "Hidan";
        this.asalNegara = "Yugakure";
        this.elemen = "-";
        this.jutsu = "Ritual Jashin";
        this.partnerTim = "Kakuzu";
    }
    @Override
    public void siapaAnda() {
        System.out.println(nama + " adalah seorang penganut agama bernama 'Jashin', sebuah kepercayaan yang menyembah " +
                "\nDewa Jashin. Dia Tidak bisa dibunuh, dan bisa melukai lawannya dengan cara melukai dirinya " +
                "\nsendiri setelah meminum darah lawannya.");
    }
    public String getPartnerTim() {
        return partnerTim;
    }
}
   
