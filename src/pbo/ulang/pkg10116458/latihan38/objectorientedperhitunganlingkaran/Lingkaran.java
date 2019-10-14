/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10116458.latihan38.objectorientedperhitunganlingkaran;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA     : Rinanda Al Qorrie Akbar
 * NIM      : 10116458
 */
public class Lingkaran {
    public Double diameter;
    public Double jarijari;
    Scanner scn = new Scanner(System.in);

    public void validasiInput() {
        String d;
        do {
            System.out.print("Masukkan nilai diameter lingkaran : ");
            d = scn.nextLine();
            System.out.println((!d.matches("[0-9]*"))?"Nilai Diameter Tidak Sesuai\n":"");

        } while (!d.matches("[0-9]*"));
        diameter = Double.parseDouble(d);
    }
    public Double hitungJarijari(double parDiameter) {
        return parDiameter/2;
    }
    public Double hitungLuas(double parJarijari) {
        return Math.PI*parJarijari*parJarijari;
    }
    public Double hitungKeliling(double parJarijari) {
        return 2*Math.PI*parJarijari;
    }
    public void hasilPerhitungan(double parDiameter){
        System.out.println("======Hasil Perhitungan Lingkaran======");
        System.out.printf("Jari-jari Lingkaran %.2f cm %n",
                hitungJarijari(parDiameter));
        System.out.printf("Luas Lingkaran %.2f cm %n",
                hitungLuas(hitungJarijari(parDiameter)));
        System.out.printf("Keliling Lingkaran %.2f cm %n",
                hitungKeliling(hitungJarijari(parDiameter)));
    }
    
}
