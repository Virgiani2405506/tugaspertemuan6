/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspertemuan6;

/**
 *
 * @author LENOVO
 */
public class PersegiPanjang {
    //Atribut dengan nama panjang dan lebar
    int panjang;
    int lebar;
    
    //Konstruktor tanpa parameter atau default atau no-org konstruktor
    PersegiPanjang(){
        panjang = 1;
        lebar = 1;
    }
    
    //Konstruktor dengan parameter
    PersegiPanjang(int newPanjang, int newLebar){
        panjang = newPanjang;
        lebar = newLebar;
    }
    
    //Method fungsi menghitung luas persegiPanjang
    int getLuas(){
        return panjang*lebar;
    }
    
    //Method menghitung keliling
    int getKeliling(){
        return 2 * (panjang+lebar);
    }
    
    //Set panjang
    void setPanjang(int newPanjang){
        panjang = newPanjang;
    }
    
    //set lebar
    void setLebar(int newLebar){
        lebar = newLebar;
    }
}
