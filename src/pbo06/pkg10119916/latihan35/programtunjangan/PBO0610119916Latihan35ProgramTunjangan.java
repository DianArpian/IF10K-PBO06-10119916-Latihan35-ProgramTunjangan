/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan35.programtunjangan;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : DIAN ARPIAN
 * NIM      : 10119916
 * KELAS    : IF10K
 * Deskripsi Program : Program Tunjangan
 */

public class PBO0610119916Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Tunjangan tnj = new Tunjangan();
        
        tnj.gaji = 0;
        
        Scanner input = new Scanner(System.in);

        // Tampilkan output ke user
        System.out.println("=========== Program Tunjangan ===========");
        System.out.print("Berapa gaji poko anda perbulan ?: Rp. ");
        tnj.gaji = input.nextInt();
        System.out.print("Status anda ? (Menikah/belum)   : ");
        tnj.status = input.next();
        tnj.hitungTunjangan();
         
    }
    
}