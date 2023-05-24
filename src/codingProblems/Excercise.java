package src.codingProblems;

/*
    a = [4,5,2,5,6,1]
    b = [1,3,7,8,2]
    -> merge the lists
    -> remove duplicates
    -> sort the array
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Excercise {
    public static void main(String[] args) {
        int [] a = {4,5,2,5,6,1};
        int [] b = {1,3,7,8,2};

        foo(a,b);
    }

    private static void foo(int[] a, int[] b)
    {
        // merge the list
        int[] res = mergeLists(a, b);
        res = sortArray(res);
        List<Integer> final_res = removeDuplicates(res, res.length);
        final_res.forEach(System.out :: print);
    }

    private static List<Integer> removeDuplicates(int[] res, int n) {
        List<Integer> ls = Arrays.stream(res).boxed().distinct()
                .collect(Collectors.toList());
        return ls;
    }

    private static int[] sortArray(int[] res)
    {
        for (int i = 0; i <= res.length; i++)
        {
            for (int j = 0; j < res.length - i -1; j++)
            {
                if (res[j] > res[j + 1])
                {
                    int temp = res[j + 1];
                    res[j + 1] = res[j];
                    res[j] = temp;
                }
            }
        }
        return res;
    }

    private static int[] mergeLists(int[] a, int[] b)
    {
        int lena = a.length; int lenb = b.length;
        int mergeLen = lena + lenb;
        int[] mergedList = new int[mergeLen];

        for (int i = 0; i < lena; i++)
            mergedList[i] = a[i];

        for (int i = 0; i < lenb; i++)
            mergedList[i + lena] = b[i];

        return mergedList;
    }
}
