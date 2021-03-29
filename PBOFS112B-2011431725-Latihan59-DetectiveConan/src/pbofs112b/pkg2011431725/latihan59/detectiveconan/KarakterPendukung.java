/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbofs112b.pkg2011431725.latihan59.detectiveconan;

/**
 *
 * @author nisaf
 */
public class KarakterPendukung extends Karakter {
    private String hubungan;
    
    public KarakterPendukung(String nama, String peran, String hubungan) {
        super(nama, peran);
        this.hubungan = hubungan;
    }
    public String getHubungan() {
        return hubungan;
    }
    public void tampilKarakterPendukung() {
        System.out.println("Nama Karakter   : " + getNama());
        System.out.println("Peran Sebagai   : " + getPeran());
        System.out.println("Hubungan dengan tokoh utama : " + getHubungan());
        System.out.println("");
    }
}
