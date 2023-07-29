package src.reactiveProgramExcercise;

import java.io.IOException;

public class Exercise2 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumbersFlux() and ReactiveSources.userFlux()

        // Print all numbers in the ReactiveSources.intNumbersFlux stream
        /*
            This basically means that, it will wait for an event to trigger and then it will subscribe
            to sysout to print the values
         */
        ReactiveSources.intNumbersFlux().subscribe(e -> System.out.println(e));

        // Print all users in the ReactiveSources.userFlux stream
        ReactiveSources.userFlux().subscribe(user -> System.out.println(user));
        /*
            Now if the below 2 codes are cmmented the below there will be no output as the process ends
            without waiting for any event to trigger, you can also use threads.sleep to implement this
         */
        System.out.println("Press a key to end");
        System.in.read();
    }

}
