
import java.nio.charset.Charset;
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
/* %([2-7][0-9a-fA-F])
|%([cdCD][0-9a-fA-F])%([89abAB][0-9a-fA-F])
|%([eE][0-9a-fA-F])%([89abAB][0-9a-fA-F])%([89abAB][0-9a-fA-F])
|%([fF][0-7])%([89abAB][0-9a-fA-F])%([89abAB][0-9a-fA-F])%([89abAB][0-9a-fA-F])
|%([fF][8aAbB])%([89abAB][0-9a-fA-F])%([89abAB][0-9a-fA-F])%([89abAB][0-9a-fA-F])%([89abAB][0-9a-fA-F])
|%([fF][cCdD])%([89abAB][0-9a-fA-F])%([89abAB][0-9a-fA-F])%([89abAB][0-9a-fA-F])%([89abAB][0-9a-fA-F])%([89abAB][0-9a-fA-F])
|%(09) */
public class RegularExpression {

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("%([cdCD][0-9a-fA-F])%([89abAB][0-9a-fA-F])");
        Matcher matcher = pattern.matcher("%C3%BF");
        // Pattern pattern = Pattern.compile("%([2-7][0-9a-fA-F])");
        //Matcher matcher = pattern.matcher("%22");
        while (matcher.find()) {
            System.out.println(matcher.group(1) + " " + matcher.group(2));
            System.out.println(Integer.parseInt(matcher.group(1), 16) + " "
                    + Integer.parseInt(matcher.group(2), 16));
            byte[] bytes = new byte[]{(byte) Integer.parseInt(matcher.group(1), 16),
                (byte) Integer.parseInt(matcher.group(2), 16)};
            for (byte b : bytes) {
                System.out.println(b);
            }
            String str = new String(bytes, Charset.forName("UTF-8"));
            System.out.println(str);
            String str1 = new String(new byte[]{(byte) Integer.parseInt("c9", 16)}, Charset.forName("UTF-8"));
            System.out.println(str1);
            byte b = (byte) 129;
            System.out.println(b);
        }
    }
}
