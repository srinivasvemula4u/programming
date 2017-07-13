/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Chegg;

/**
 *
 * 
 */
public class Business {
    private String name;
    private String type;
    private Account acct;
    public Business() {
        
    }
    public String getName() {
        return this.name;
    }
    public void setName(String pName) {
        this.name = pName;
    }
    public String getType() {
        return this.type;
    } 
    public void setType(String pType) {
        this.type = pType;
    }
    public Account getAcct() {
        return this.acct;
    }
    public void setAcct(Account pAcct) {
        this.acct = pAcct;
    }
    public String toString() {
        return "Business name is " + getName() + ", its type is "+ getType() + " and its account details are "
                + getAcct().toString();
    }
}
