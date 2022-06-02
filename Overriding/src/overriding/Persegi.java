/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author USER
 */
public class Persegi extends BangunDatar{
    float sisi;
    
    @Override
    public void luas(){
        float luas = sisi*sisi;
        System.out.println("Luas Persegi: "+luas);
    }
    @Override
    public void keliling(){
        float keliling = 4*sisi;
        System.out.println("Keliling Persegi: "+keliling);
    }
}

