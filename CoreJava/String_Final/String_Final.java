package CoreJava.String_Final;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class String_Final{
    public static void main(String[] args) {
        System.out.println(Arrays.asList(String1()));
        System.out.println(String2("algorithm", "algorithms"));
        System.out.println(String3());
        System.out.println(String4(Arrays.asList("https", "www", "amazon", "com", "demo", "test", "abc")));
        Final f = new Final();
        f.modify("123456");
        System.out.println(f.ID);
        f.modify("654321");
        System.out.println(f.ID);
    }

    /*------------------------- String ---------------------------*/

    // 1) Given string “Algorithms”, return  “go” and “Algo” using substring
    public static String[] String1() {
        String s = "Algorithms";
        String[] ans = new String[2];

        ans[0] = s.substring(2,4);
        ans[1] = s.substring(0,4);

        return ans;
    }

    // 2) Given two strings, compare if these two strings are equal by comparing each character
    public static boolean String2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // 3) Given string “https://www.amazon.com/demo?test=abc”, return [“https”,”www”,”amazon”,”com”,”demo”,”test”,”abc”]
    public static List<String> String3() {
        String url = "https://www.amazon.com/demo?test=abc";
        StringTokenizer stringTokenizer = new StringTokenizer(url, ":./?=");
        List<String> list = new ArrayList<>();
        while (stringTokenizer.hasMoreTokens()) {
            list.add(stringTokenizer.nextToken());
        }

        return list;
    }

    // 4) Given a list of string array, combine them into one string sentence, return the string sentence
    public static String String4(List<String> list) {
        StringBuilder ans = new StringBuilder();
        for (String str : list) {
            ans.append(str);
        }
        return ans.toString();
    }


}

/*------------------------- Final ---------------------------*/
// Problems: define a final class and final method and final variable, modify the value of the variable in final method
final class Final {
    public final StringBuilder ID;

    public Final() {
        ID = new StringBuilder();
    }

    public final void modify(String ID) {
        this.ID.delete(0, ID.length());
        this.ID.append(ID);
    }
}
