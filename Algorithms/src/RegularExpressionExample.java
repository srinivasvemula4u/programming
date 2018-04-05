/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sv186040
 */
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* Name of the class has to be "Main" only if the class is public. */
public class RegularExpressionExample {

    public static final String EXAMPLE_TEST = "https12e345d";

    public static void main(String[] args) throws java.lang.Exception {
        Pattern pattern = Pattern.compile("^(http|https)([A-Fa-f0-9].*)$");
        Pattern pattern1 = Pattern.compile("^(?:http|https)([A-Fa-f0-9]+)$");
        Matcher matcher = pattern.matcher(EXAMPLE_TEST);
        Matcher matcher1 = pattern1.matcher(EXAMPLE_TEST);

        // check all occurance
        while (matcher.find()) {
            System.out.print("Start index: " + matcher.start());
            System.out.print(" End index: " + matcher.end() + " ");
            System.out.println(matcher.group());
            System.out.println(matcher.group(0) + " " + matcher.group(1) + " " + matcher.group(2));
        }

        while (matcher1.find()) {
            System.out.print("Start index: " + matcher1.start());
            System.out.print(" End index: " + matcher1.end() + " ");
            System.out.println(matcher1.group());
        }

        //System.out.println();
    }
}
