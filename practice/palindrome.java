package practice;

public class palindrome {

    public static boolean ispalindrome(String S) {
        int length = S.length();
        for(int i = 0;i <= length/2;i++) {
            if(S.charAt(i) != S.charAt(length-i-1)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println(ispalindrome("Hello"));
    }
}
