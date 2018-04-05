
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author sv186040
 */
public class GQueryRegex {

    public static final Pattern pat = Pattern.compile("([&#]?)([^&#]+)");

    static final String parse(String str) {
        Matcher match = pat.matcher(str);
        while (match.find()) {
            String d = match.group(1);
            String st = match.group(2);
            System.out.println("d = " + d + " " + "st = " + st);

        }
        return null;
    }

    public static void main(String[] args) {
        parse("#&http:// &www.google.com/search?hl=en&q=%22Aster+Data+Systems%22");
    }

}
