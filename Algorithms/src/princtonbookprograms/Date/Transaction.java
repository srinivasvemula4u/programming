/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princtonbookprograms.Date;

/**
 *
 * @author srivemul
 */
public class Transaction implements Comparable<Transaction> {

    @Override
    public int compareTo(Transaction t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Transaction(String who, Date date,double amount)
    {
        
    }
    public Transaction(String transaction)
    {
        
    }
    public Date When()
    {
        return when;
    }
    public String Who()
    {
        return who;
    }
    public double Amount()
    {
        return amount;
    }
    private String who;
    private Date when;
    private double amount;
}
