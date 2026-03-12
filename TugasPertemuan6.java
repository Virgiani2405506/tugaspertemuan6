/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugaspertemuan6;

/**
 * Ini adalah kelas main untuk memanggil kelas-kelas di java
 * @author LENOVO
 */
public class TugasPertemuan6 {

    public static void main(String[] args) {
        PersegiPanjang objectPersegiPanjang1 = new PersegiPanjang();
        System.out.println("Luas persegi panjang dengan panjang = " 
        + objectPersegiPanjang1.panjang + " dan lebar = "
        + objectPersegiPanjang1.lebar + " adalah "
        + objectPersegiPanjang1.getLuas()
        + ", sedangkan kelilingnya adalah "
        + objectPersegiPanjang1.getKeliling());

        
        PersegiPanjang objectPersegiPanjang2 = new PersegiPanjang();
        objectPersegiPanjang2.setPanjang(30);
        objectPersegiPanjang2.setLebar(40);

        System.out.println("Luas persegi panjang dengan panjang = " 
        + objectPersegiPanjang2.panjang + " dan lebar = "
        + objectPersegiPanjang2.lebar + " adalah "
        + objectPersegiPanjang2.getLuas()
        + ", sedangkan kelilingnya adalah "
        + objectPersegiPanjang2.getKeliling());


        PersegiPanjang objectPersegiPanjang3 = new PersegiPanjang();
        objectPersegiPanjang3.setPanjang(25);
        objectPersegiPanjang3.setLebar(35);

        System.out.println("Luas persegi panjang dengan panjang = " 
        + objectPersegiPanjang3.panjang + " dan lebar = "
        + objectPersegiPanjang3.lebar + " adalah "
        + objectPersegiPanjang3.getLuas()
        + ", sedangkan kelilingnya adalah "
        + objectPersegiPanjang3.getKeliling());
    }
}
