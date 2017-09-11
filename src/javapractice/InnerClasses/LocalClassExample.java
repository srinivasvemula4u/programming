/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice.InnerClasses;

/**
 *
 * 
 */
public class LocalClassExample {

    static String regularExpression = "[^0-9]";

    public static void validatePhoneNumbers(String ph1, String ph2) {
        final int numLength = 10;
        class PhoneNumber {

            private String formattedNumber = null;

            PhoneNumber(String ph) {
                String newString = ph.replaceAll(regularExpression, "");
                if (newString.length() == numLength) {
                    formattedNumber = newString;
                } else {
                    formattedNumber = null;
                }
            }

            public String getFormattedPhoneNumber() {
                return formattedNumber;
            }
        }
        PhoneNumber firstNumber = new PhoneNumber(ph1);
        PhoneNumber secondNumber = new PhoneNumber(ph2);
        if (firstNumber.getFormattedPhoneNumber() == null) {
            System.out.println("First Number is not valid");
        } else {
            System.out.println("First Number is : " + firstNumber.getFormattedPhoneNumber());
        }
        if (secondNumber.getFormattedPhoneNumber() == null) {
            System.out.println("Second Number is not valid");
        } else {
            System.out.println("Second  Number is : " + firstNumber.getFormattedPhoneNumber());
        }
    }
    public static void main(String[] args) {
        validatePhoneNumbers("123-456-789-0", "456-789");
    }
}
