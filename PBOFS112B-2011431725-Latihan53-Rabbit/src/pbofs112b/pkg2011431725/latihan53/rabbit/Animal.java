/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbofs112b.pkg2011431725.latihan53.rabbit;

/**
 *
 * @author nisaf
 * Nama        : Nisa Febriyani
 * Kelas       : PBO FS112B
 * NIM         : 2011431725
 * Deskripsi Program : Program ini berisi untuk menampilkan Deskripsi Hewan
 */
        
public class Animal  {
    protected boolean vegetarian;
    protected String eats;
    protected int noOfLegs;
    
    public Animal(boolean vegetarian, String food, int legs) {
        this.vegetarian = vegetarian;
        this.eats = food;
        this.noOfLegs = legs;
    }
    public boolean isVegetarian() {
        return vegetarian;
    }
    public String getEats() {
        return eats;
    }
    public int getNoOfLegs() {
        return noOfLegs;
    }
}
