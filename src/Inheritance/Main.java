package Inheritance;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args){
        String[] strArr = new String[5];
        List<String> strings = new ArrayList<>();
        strings.add("aa");
        strings.add("bb");
        strings.add("cc");
        strings.add("dd");
        strings.add("ee");
        strings.add(2,"xxx");

        System.out.println(strings);
        System.out.println(strings.get(2));

        strings.remove(4);
        System.out.println(strings);

        System.out.println("-------------------------------");
        List<String> str1 = new ArrayList<>(List.of("aa","bb","cc"));
        // can add this way, to avoid the error neew to add implementation
        System.out.println(str1);

        str1.add(2,"PPP");
        System.out.println(str1);
        System.out.println(str1.size());

        Iterator<String> iter = strings.iterator();
        while (iter.hasNext()) {
            String a = iter.next();
            System.out.println(iter);

        }
    }
    private static List<String> filterStartingWIthA(List<String> strs) {
        List<String> result = new ArrayList<>();
        for (String element : strs) {
            if (element.startsWith("a")) {
                result.add(element);
            }
        }
        return result;
    }




}
