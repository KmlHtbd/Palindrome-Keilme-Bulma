import java.util.Scanner;

public class PalindromeWord {
    //first way method
    static boolean isPalindrome(String str){
        int i=0;
        int j=str.length();
        while (i<j){
            if (str.charAt(i)!=str.charAt(j-1)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
    //second way method
    static boolean isPalindrome2 (String str){
        String reverse = "";
        for (int i=str.length()-1;i>=0;i--){
            reverse += str.charAt(i);
        }
        if (str.equals(reverse)){
            return true;
        }else
            return false;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String str = input.nextLine();
        if (isPalindrome(str)||isPalindrome2(str)){
            System.out.println(str+" Palindrom bir kelimedir.");
        }else
            System.out.println(str+" Palindrom bir kelime değildir.");
    }
}