/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Konstruktor;

/**
 *
 * @author aerdy
 */
public class Manusia {
    String nama;
    Boolean isKenyang;
    int jumPiring;
    
    void setNama (String _nama){
        nama =_nama;
        
    }
    String getNama(){
        return nama;
    }
    void makan(){
    cekJumpPiring();
    if(isKenyang==false){
        System.out.println(nama+"lapar makan ahh");
    }
    else{
        System.out.println(nama+"Sudah makan");
    }
    }
    void cekJumpPiring(){
        jumPiring = jumPiring +1;
        if (this.jumPiring>3)
        isKenyang =true;    
        
    }
    
}
