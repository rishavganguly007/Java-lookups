package src.codingProblems;
import java.util.*;
public class CountFrequency {

    public static void count(String str) {
        Map<Character, Integer> mp = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            Character s = str.charAt(i);
            if (mp.containsKey(s)) {
                mp.put(s, mp.get(s) + 1);
            }
            else
                mp.put(s, 1);
        }


    }

    public static void main(String[] args) {

        count("hello");

    }
}
