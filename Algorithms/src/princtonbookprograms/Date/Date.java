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
public class Date implements Comparable<Date> {

    public Date(int month, int date, int year) {

    }

    public Date(String Date) {

    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }

    @Override
    public String toString() {
        return null;
    }

    /**
     *
     * @param t
     * @return
     */
//    @Override
//    public boolean equals(Object t)
//    {
//        return true;
//    }
    @Override
    public int compareTo(Date t) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int hashCode() {
        return 1;
    }

    @Override
    public boolean equals(Object x) {
        if (this == x) {
            return true;
        }
        if (x == null) {
            return false;
        }
        if (x.getClass() != this.getClass()) {
            return false;
        }
        Date that = (Date) x;
        if (this.day != that.day) {
            return false;
        }
        if (this.month != that.month) {
            return false;
        }
        if (this.year != that.year) {
            return false;
        }
        return true;
    }
    private int month, day, year;
}
