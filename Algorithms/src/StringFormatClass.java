/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sv186040
 */
public class StringFormatClass {

    public static void main(String[] args) {
        int startGroupIndex = 1;
        int doubleC = startGroupIndex + 3;
        int doubleCLAI = startGroupIndex + 2;
        int pureILAI = startGroupIndex + 4;
        String patStr = String.format("((((?=\\S*(::))(?!\\S*\\%d.+\\%d))\\%d?|(?!\\S*::)[\\da-fA-F]{1,4}:|((?!\\S*:)(?=(\\w+\\.){3}\\w+\\b)))(([\\da-fA-F]{1,4}(\\%d|:\\b)|\\%d|\\%d){5})(([\\da-fA-F]{1,4}(\\%d|:?\\b)|\\%d|\\%d){2}|(((2[0-4]|1\\d|[1-9])?\\d|25[0-5])(\\.?\\b)){4}))",
                doubleC,
                doubleC,
                doubleC,
                doubleC,
                doubleCLAI,
                pureILAI,
                doubleC,
                doubleCLAI,
                pureILAI);

        System.out.println(patStr);

        String output = String.format("%s = %d", "joe", 35);
        System.out.println(output);
    }
}
