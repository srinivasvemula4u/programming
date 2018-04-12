/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NarsihmaKarunmanchi.StringMatchingAlgorithms;

/**
 *
 * @author srivemul
 */
public class WildCardMatchAlgorithm {

    public static boolean wildCardMatchAlgorithm(String text, String pattern) {
        int textLen = text.length();
        int patLen = pattern.length();
        int i = 0, j = 0;
        if (textLen == 0 && patLen == 0) {
            return true;
        }
        if (textLen == 0 && patLen == 1 && pattern.charAt(0) == '*') {
            return true;
        }
        if (textLen != 0 && patLen == 1 && (pattern.charAt(0) == '*' || pattern.charAt(0) == '?')) {
            return true;
        }
        while (i < textLen) {
            if ((j < patLen) && (text.charAt(i) == pattern.charAt(j))) {
                i++;
                j++;
                if (j == patLen && i == textLen) {
                    return true;
                }
            } else if ((j < patLen) && (pattern.charAt(j) == '*')) {
                if ((patLen == j - 1)) {
                    return true;
                } else {
                    j++;
                    while (j < patLen && i < textLen && ((pattern.charAt(j) == text.charAt(i)) || ((pattern.charAt(j) == '*')
                            || pattern.charAt(j) == '?'))) {
                        i++;
                        j++;
                    }
                    if (j == patLen) {
                        return true;
                    }
                }
            } else if ((j < patLen) && (pattern.charAt(j) == '?')) {
                if ((patLen == j - 1) && i < textLen - 1) {
                    return true;
                }
                while (j < patLen && i < textLen && ((pattern.charAt(j) == text.charAt(i)) || ((pattern.charAt(j) == '*')
                        || pattern.charAt(j) == '?'))) {
                    i++;
                    j++;
                }
                if (j == patLen) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        System.out.println(wildCardMatchAlgorithm("aa", "a"));
        System.out.println(wildCardMatchAlgorithm("aa", "aa"));
        System.out.println(wildCardMatchAlgorithm("aaa", "aa"));
        System.out.println(wildCardMatchAlgorithm("aa", "*"));
        System.out.println(wildCardMatchAlgorithm("aa", "a*"));
        System.out.println(wildCardMatchAlgorithm("aa", "?*"));
        System.out.println(wildCardMatchAlgorithm("aab", "c*a*b"));
        System.out.println(wildCardMatchAlgorithm("aba", "ab?*"));
    }

}
