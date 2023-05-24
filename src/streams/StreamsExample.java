package src.streams;

import lombok.extern.java.Log;

import java.util.Arrays;
import java.util.HashMap;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsExample {
    public static void main(String[] args) {
        //findEvenNumber();
        //numberStartsWithOne();
        countFrequencyWithStreams();
    }

    private static void countFrequencyWithStreams() {
        List<Integer> ls = Arrays.asList(1,4,2,3,5,3,2,4,2,5,3,1);
        Map<Integer, Long> mp = ls.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()));
        System.out.println(mp);
    }

    private static void numberStartsWithOne() {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,11,22,334);
        ls.stream()
                .map(s -> s + "")
                .filter(s -> s.startsWith("1"))
                .forEach(s -> System.out.println(s + " "));
    }

    private static void findEvenNumber() {
        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,8,11,22,334);
        ls.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.print(e + " "));
    }
}
