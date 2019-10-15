/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang.pkg10117185.latihan31.perkenaalanmahasiswa;

/**
 *
 * @author
 * Nama       : Andhyka WIdariyanto  
 * Kelas      : IF-Ulang
 * NIM        : 10117185 
 * Deskriipsi : Membuat program perkenalan mahasiswa dengan konsep pendekatan berbasis object
 */
public class pboulangpkg10117185latihan31PerkenaalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = "10117124";
        mhs1.nama = "Jeff Gordon";
        mhs1.perkenalkanDiri();
        
        mhs1.nim = "10117143";
        mhs1.nama = "Raihani Lathifa Ariedi";
        mhs1.perkenalkanDiri();
        
        mhs1.nim = "10117169";
        mhs1.nama = "Kireina Perito";
        mhs1.perkenalkanDiri();
        
        mhs1.nim = "10117171";
        mhs1.nama = "Tom Misch";
        mhs1.perkenalkanDiri();
    }
    
}
