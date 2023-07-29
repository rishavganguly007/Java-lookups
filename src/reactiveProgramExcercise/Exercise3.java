package src.reactiveProgramExcercise;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class Exercise3 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux()

        // Get all numbers in the ReactiveSources.intNumbersFlux stream
        // into a List and print the list and its size
        List<Integer> nums = ReactiveSources.intNumbersFlux().toStream().collect(Collectors.toList());
        // This ln will run after a delay of 1 * n secs as it is a blocking operation, ie it will hold untill its has everything
        System.out.println("List is " + nums );
        System.out.println("Size " + nums.size());

        /*
        Flux is a async seq 0 -> n items
        Mono is a async seq 0 or 1 item
         */

        System.out.println("Press a key to end");
        System.in.read();
    }

}
