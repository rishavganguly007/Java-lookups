package codingProblems;

import java.util.*;
import java.util.stream.Collectors;

public class ReadOnlyArray {

    public static void findDistinct(List<Integer> listWithDuplicates ) {
        // To find: duplicate
        /*String val = "aabbcdd";
        Map<Character, Integer> mp = new HashMap<>();
        char[] ch = val.toCharArray();

        for(Character c: ch) {
            if (mp.containsKey(c)) {
                Integer v = mp.get(ch)+1;
                mp.put(c, v );
            } else {
                mp.put(c, 1);
            }
        }
        Set<Character> st = mp.keySet();
        for (Character c: st) {
            if(mp.get(c) > 1) {
                System.out.println(c);
            }
        }*/
        listWithDuplicates.stream().distinct().toList().forEach(System.out::println);


    }
    public static void main(String[] args) {
     //
        List<Integer> list = new ArrayList<>();

//        for (int i = 0; i < 10; i++) {
//            list.add(i);
//        }
        list.add(5);
        list.add(5);
        list.add(2);
        list.add(2);
        findDistinct(list);
    }

}
