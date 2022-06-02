/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overloading;

/**
 *
 * @author USER
 */
public class BangunDatar {
double luas;
double T = 15;

void luas(double panjang, double lebar){
luas = panjang*lebar;
    System.out.println("Luas Persegi Panjang: "+luas);
}
void luas(int panjang, int lebar, int T){
    luas = panjang*lebar*T;
    System.out.println("Luas Kotak: "+luas);
}
}
