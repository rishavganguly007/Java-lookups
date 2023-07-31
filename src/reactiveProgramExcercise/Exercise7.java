package src.reactiveProgramExcercise;

import java.io.IOException;

public class Exercise7 {


    public static void main(String[] args) throws IOException {

        // Use ReactiveSources.intNumberMono() and ReactiveSources.userMono()

        // Print all values from intNumbersFlux that's greater than 5
        // position of log matters
        ReactiveSources.intNumbersFlux().log().filter(x -> x > 5).subscribe(System.out:: println);

        // Print 10 times each value from intNumbersFlux that's greater than 5
        ReactiveSources.intNumbersFlux()
                .filter(e -> e > 5)
                        .map(e -> e * 10)
                                .log()
                                        .subscribe(System.out:: println);

        // Print 10 times each value from intNumbersFlux for the first 3 numbers emitted that's greater than 5
        ReactiveSources.intNumbersFlux().filter(e -> e > 5).
                map(e -> e * 10).
                take(3). // equivalent to .limit() in streams
                subscribe(System.out:: println);

        // Print each value from intNumbersFlux that's greater than 20. Print -1 if no elements are found
        ReactiveSources.intNumbersFlux().
                filter(e -> e > 20).
                defaultIfEmpty(-1).
                subscribe(System.out:: println);

        // Switch ints from intNumbersFlux to the right user from userFlux
        ReactiveSources.intNumbersFlux().
                flatMap(i -> ReactiveSources.userFlux().filter(user -> user.getId() == i)).
                subscribe(System.out:: println);

        // Print only distinct numbers from intNumbersFluxWithRepeat
        ReactiveSources.intNumbersFluxWithRepeat()
                .log()
                .distinct()
                .subscribe();

        // Print from intNumbersFluxWithRepeat excluding immediately repeating numbers
        ReactiveSources.intNumbersFluxWithRepeat()
                .log()
                .distinctUntilChanged()
                .subscribe();

        System.out.println("Press a key to end");
        System.in.read();
    }

}
