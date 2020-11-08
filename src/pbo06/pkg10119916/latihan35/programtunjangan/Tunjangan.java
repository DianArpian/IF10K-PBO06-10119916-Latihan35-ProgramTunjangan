/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo06.pkg10119916.latihan35.programtunjangan;

/**
 *
 * @author DIAN
 */
public class Tunjangan {
        public String status;
    public float gaji, tunjangan, totalGaji;
    
    public void hitungTunjangan(){
        
       if(gaji >= 6000000 && status.equals("Menikah") || status.equals("menikah") ){              
                    tunjangan =(float) (0.35*gaji); 
                    totalGaji = gaji+tunjangan;
                    System.out.println("=========== Hasil Perhitungan Gaji Anda ===========");
                    System.out.println("Gaji Pokok      : Rp. " + gaji);        
                    System.out.println("Tunjangan       : Rp. " + tunjangan);        
                    System.out.println("Total Gaji      : Rp. " + totalGaji);
            }else{
                System.out.println("=========== Hasil Perhitungan Gaji Anda ===========");
                tunjangan = 0; 
                System.out.println("Gaji Pokok      : Rp. " + gaji);        
                System.out.println("Tunjangan       : Rp. " + tunjangan);        
                System.out.println("Total Gaji      : Rp. " + gaji + tunjangan);
            }    
    }
}