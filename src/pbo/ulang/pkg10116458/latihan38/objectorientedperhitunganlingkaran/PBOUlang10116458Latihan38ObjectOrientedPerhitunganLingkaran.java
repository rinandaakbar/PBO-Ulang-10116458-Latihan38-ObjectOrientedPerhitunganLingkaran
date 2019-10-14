/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan38.objectorientedperhitunganlingkaran;

/**
 *
 * @author
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class PBOUlang10116458Latihan38ObjectOrientedPerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lingkaran lkr = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        lkr.validasiInput();
        lkr.hasilPerhitungan(lkr.diameter);
    }
    
}
