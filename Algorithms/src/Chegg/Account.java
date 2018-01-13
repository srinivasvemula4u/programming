/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor..
 */
package Chegg;

/**
 *
 * 
 */
public class Account {
    private String type;
    private String number;
    private Double balance;
    public Account() {
        
    }
    public String getType() {
        return this.type;
    }
    public void setType(String pTyp) {
        this.type = pTyp;
    }
    public String getNumber() {
        return this.number;
    }
    public void setNumber(String pNbr) {
        this.number = pNbr;
    }
    public Double getBalance() {
        return this.balance;
    }
    public void setBalance(Double pBal) {
        this.balance = pBal;
    }
    public String toString() {
        return "Account type is" + getType() + ",\n its number is "+ getNumber()
                + "\n and  its  balance is "+ getBalance();
    }
}
