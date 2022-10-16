/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ATM.controller;

import ATM.model.Saldo;
import ATM.services.ATMService;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import ATM.services.ATMInterface;

/**
 *
 * @author Nico
 */
@ManagedBean(name = "userActionBean")
@RequestScoped
public class UserActionBean {
    private ATMService _atmService;
    private int userInput;

    
    public int getUserInput(){
        return userInput;
    }
    
    public void setUserInput(int userInput){
        this.userInput = userInput;
    }

    public UserActionBean() {
        _atmService = new ATMService();
    }
    
    public String getSaldo() {
        return "Saldo anda sekarang Rp." + _atmService.getSaldo();
    }
    
    public String tarikUang(){
        int uang;
        uang = userInput;
        
        if (_atmService.getSaldo() - uang < 100000){
            return "nominal penarikan melebihi batas minimal sisa saldo";
        }
        
        else if (uang % 50000 == 0){
            _atmService.tarikan(uang);
     

                
        int saldoSekarang = _atmService.getSaldo(); 
                
        return "anda menarik Rp."+uang+", uang anda tersisa Rp." + saldoSekarang ;
        }
        
        else {
            return "Nominal bukan kelipatan Rp50.000";
        }
        
    }
    
    public String setorUang(){
        int uang;
        uang = userInput;
        
        if (uang % 50000 == 0){
            _atmService.setoran(uang);
            
            int saldoSekarang = _atmService.getSaldo();
            
            return "anda menyetor Rp."+uang+", uang anda sekarang Rp." + saldoSekarang;
        }
        
        else {
            return "Nominal bukan kelipatan Rp50.000";
        }
        
        
        
    }
   
}
