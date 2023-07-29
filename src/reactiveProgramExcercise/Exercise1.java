package src.reactiveProgramExcercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()
        StreamSources src = new StreamSources();
        // Print all numbers in the intNumbersStream stream

        Stream<Integer> st = src.intNumbersStream();
       // st.forEach(s -> System.out.print(s));

        // Print numbers from intNumbersStream that are less than 5

        // st.filter(i -> i < 5).forEach(s -> System.out.println(s));

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // st.filter(i -> i > 5).limit(2).forEach(s -> System.out.println(s));


        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1


        // Print first names of all users in userStream
//        Integer s = st.filter(i -> i > 5).
//                findFirst().
//                orElse(-1);
//        System.out.println(s);


        // Print first names in userStream for users that have IDs from number stream

        List<Integer> stList =  st.collect(Collectors.toList());
        Stream<User> user = src.userStream();
            user.
                filter(i -> stList.contains(i.getId())).
                map(User::getFirstName).
                forEach(System.out::println);

    }

}
