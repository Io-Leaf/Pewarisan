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
public class Overloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    BangunDatar overloading = new BangunDatar();
    
    overloading.luas(2,3); //Karena ini tidak ada koma dakam angka maka// 
                           //ini merujuk pada method yang memiliki integer diparameternya//
    overloading.luas(3.7,8);//Karena ini tiada koma dakam angka maka// 
                           //ini merujuk pada method yang memiliki integer diparameternya//
    }
    
}
