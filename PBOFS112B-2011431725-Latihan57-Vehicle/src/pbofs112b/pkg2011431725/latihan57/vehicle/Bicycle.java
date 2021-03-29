package pbofs112b.pkg2011431725.latihan57.vehicle;

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
 * Deskripsi Program : Program ini berisi untuk menampilkan jenis vehicle
 */
public class Bicycle extends Vehicle {
    public int myGearCount;
    
    public Bicycle() {
        System.out.println("Bicycle");
        super.setBrand("Trek Bike");
        System.out.println("Brand   : " + super.getBrand());
        super.setModel("7.4FX");
        System.out.println("Model   : " + super.getModel());
        setGearCount(23);
        System.out.println("Jumlah Gear : " + getGearCount());
        System.out.println("");
    }
    public int getGearCount() {
        return myGearCount;
    }
    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }
}
