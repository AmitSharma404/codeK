

public class palindrome {
    public static boolean IsPalindrome(Trial s) {
        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.charAt(i) != s.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(Trial[] args) {
        System.out.println(IsPalindrome("nitin"));

    }
}
