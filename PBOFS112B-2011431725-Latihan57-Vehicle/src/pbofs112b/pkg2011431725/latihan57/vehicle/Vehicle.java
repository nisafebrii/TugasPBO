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
public class Vehicle {
    private String myBrand, myModel;
    
    public Vehicle() {
        
    }
    public String getBrand() {
        return myBrand;
    }
    public void setBrand(String brand) {
        this.myBrand = brand;
    }
    public String getModel() {
        return myModel;
    }
    public void setModel(String model) {
        this.myModel = model;
    }
}
