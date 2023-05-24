package src.codingProblems;

public class Palindrome {
    public static void main(String[] args) {
       String str = "caabbaac";
       System.out.println(isPalindrome(str));
    }

    private static String isPalindrome(String str) {
        char[] ch = str.toCharArray();
        int n = ch.length;
        int l = 0; int r = n -1;
        while(l < r)
        {
            if (ch[l] != ch[r])
                return "false";
            l++;
            r--;
        }
        return "true";

    }
}
