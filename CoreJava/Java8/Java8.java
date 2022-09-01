package CoreJava.Java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Java8 {

    public static void main(String[] args) {
        System.out.println("Problem 1: ");
        System.out.println("VisaCard check:");
        VisaCard visaCard = new VisaCard("John", "1234", 1000, "visa");
        System.out.println("Accept visa: " + visaCard.isCardAcceptable("visa"));
        System.out.println("Accept master: " + visaCard.isCardAcceptable("master"));
        visaCard.payBill(500);
        VisaCard.refund(20);
        System.out.println("MasterCard check:");
        MasterCard masterCard = new MasterCard("John", "1234", 1000, "master");
        System.out.println("Accept visa: " + masterCard.isCardAcceptable("visa"));
        System.out.println("Accept master: " + masterCard.isCardAcceptable("master"));
        masterCard.payBill(300);
        MasterCard.refund(100);
        System.out.println("-------------------------");
        System.out.println("Problem 2: ");
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
//        System.out.println(new MyStream.Interface(list, ((int o) -> o * 3)));
        System.out.println("-------------------------");
        System.out.println("Problem 3: ");
        // 3. "walabcwalexywalxzsfwalmx"  -- replace "wal" with "sams"
        String s = "walabcwalexywalxzsfwalmx";
        System.out.println(Arrays.asList(s.split("wal")).stream().collect(Collectors.joining("sams")));
        System.out.println("-------------------------");
        System.out.println("Problem 4: ");
        /* 4. "Eclipse eclipse Eclipse eclipse amc clip ECLIPSE" – count the occurrence of each unique word (ignore case),
        return result as a map. For example (eclipse->5, amc->1, clip->1)
         */
        String s1 = "Eclipse eclipse Eclipse eclipse amc clip ECLIPSE";
        System.out.println(Arrays.asList(s1.toLowerCase().split(" ")).stream().collect(Collectors.groupingBy(o -> o, Collectors.summingInt(o -> 1))));
    }
}
