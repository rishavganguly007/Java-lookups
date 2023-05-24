package src.codingProblems;

import java.util.Arrays;

public class FibonacciSequence {

    public static void main(String[] args) {
        int n = 10;
        int[] res = new int[n];

        res[0] = 0; res[1] = 1;
        for (int i = 2; i < n; i++)
        {
            res[i] = res[i-1] + res[i-2];
        }
        int sum = Arrays.stream(res).sum();
        System.out.println(sum);
        for (int i : res)
            System.out.print(i + " ");

    }
}
