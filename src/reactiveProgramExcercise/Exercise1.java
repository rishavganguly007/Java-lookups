package src.reactiveProgramExcercise;

import java.util.stream.Stream;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()
        StreamSources src = new StreamSources();
        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        Stream<Integer> st = src.intNumbersStream();
       // st.forEach(s -> System.out.println(s));

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        st.filter(i -> i < 5).forEach(s -> System.out.println(s));

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here

        // Print first names of all users in userStream
        // TODO: Write code here

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here

    }

}
