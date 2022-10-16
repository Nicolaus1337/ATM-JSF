/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATM.model;

/**
 *
 * @author Nico
 */
public class Saldo {
    private static Saldo instanceSaldo;
    private int jumlahUang;
    
    private Saldo(){
        jumlahUang = 500000;
    };

    public int getAmount() {
        return jumlahUang;
    }

    public void setAmount(int jumlahUang) {
        this.jumlahUang = jumlahUang;
    }
    
    public static Saldo getInstance() {
        if (instanceSaldo == null) {
            instanceSaldo = new Saldo();
        }       
        return instanceSaldo;
    }
}
