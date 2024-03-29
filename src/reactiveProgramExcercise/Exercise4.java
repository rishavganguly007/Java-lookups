package src.reactiveProgramExcercise;

import java.io.IOException;

public class Exercise4 {

    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono()

        // Print the value from intNumberMono when it emits
        ReactiveSources.intNumberMono().subscribe(e -> System.out.println(e),
                err -> System.out.println((err.getMessage())),
                () -> System.out.println("Complete"));

        // Get the value from the Mono into an integer variable
        Integer num = ReactiveSources.intNumberMono().block();


        System.out.println("Press a key to end");
        System.in.read();
    }

}
