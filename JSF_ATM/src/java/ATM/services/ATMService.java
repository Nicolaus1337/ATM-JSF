/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATM.services;

import ATM.model.Saldo;

/**
 *
 * @author Nico
 */
public class ATMService implements ATMInterface {
    
    private Saldo _saldo;

    public ATMService() {
        _saldo = Saldo.getInstance();
    }
    
    @Override
    public int getSaldo() {
        return _saldo.getAmount();
    }

    @Override
    public int tarikan(int uang) {
        _saldo.setAmount(_saldo.getAmount()-uang);
          
        return _saldo.getAmount();
    }

    @Override
    public int setoran(int uang) {
        _saldo.setAmount(_saldo.getAmount()+uang);
          
        return _saldo.getAmount();
    }
    
}
