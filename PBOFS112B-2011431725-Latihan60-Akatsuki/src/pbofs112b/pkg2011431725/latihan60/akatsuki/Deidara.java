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
public class Deidara extends Akatsuki{
    private String partnerTim;
    
    public Deidara() {
        this.nama = "Deidara";
        this.asalNegara = "Iwagakure";
        this.elemen = "Bom kertas (ledakan), Tanah liat";
        this.jutsu = "-";
        this.partnerTim = "Sasori";
    }
    @Override
    public void siapaAnda() {
        System.out.println(nama + " adalah anggota Akatsuki ninja pelarian, dan asal negara " + asalNegara );
    }
    public String getPartnerTim() {
        return partnerTim;
    }
}
    
   