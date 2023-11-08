package org.example;

public class Main {
    public static void main(String[] args) {
        String word = "Pilip"; //тут можна змінити слово
        if(PalindromChecker.isPalindrome(word)){
            System.out.println("Це слово палідром");
        }
        else System.out.println("Це слово не палідром");
    }
}
class PalindromChecker {
    public static boolean isPalindrome(String word){
        word = word.toLowerCase().replaceAll("\\s+", "");
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if(word.charAt(left) != word.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}