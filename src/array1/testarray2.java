/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array1;

/**
 *
 * @author ASUS GAMING PC
 */
public class testarray2 {

    
        int nis[][] = {{210651}, {210651}, {210652}};
        String nama[][] = {{"Ade"}, {"Galih"}, {"Baihaqi"}};
    

    public void tampil(String n) {
        System.out.println("Identitas Siswa Angkatan 24");
    }

    public void namanis(int n) {
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < 1; j++) {
                System.out.println(nama[1][j] + ":" + nis[1][j]);

            }
        }
    }

    public static void main(String[] args) {
        testarray2 siswa = new testarray2();
        siswa.tampil(null);
        siswa.namanis(0);
    }

}

