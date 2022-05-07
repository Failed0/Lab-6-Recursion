package uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.recursion;

import java.util.Arrays;
import java.util.List;

public class Kpalindrome1 implements PalindromeChecker {

    @Override
    public boolean isKPalindrome(String s, int i) {
        //        Boolean bool = true;
//
//        if (s.length() == 1 && s.length() <= i) {
//            bool = true;
//        }
//        if (i >= 0) {
//            if (s.charAt(0) == s.charAt(s.length() - 1)) { //we get rid of the first and last
//                s = s.substring(0, s.length() - 1);
//                isKPalindrome(s, s.length());
//                bool = true;
//            } else if (s.charAt(1) == s.charAt(s.length() - 1) && i > 0) { //comp second and last
//                s = s.substring(1, s.length() - 1);
//                i -= 1;
//                isKPalindrome(s, s.length());
//                bool = true;
//            } else if (s.charAt(0) == s.charAt(s.length() - 2) && i > 0) { //cmp first to second to last
//                s = s.substring(0, s.length() - 2);
//                i -= 1;
//                isKPalindrome(s, s.length());
//                bool = true;
//            }else if(s.length() == 1){
//                bool = true;
//            }else {
//                System.out.println("It is not a " + i + "-Palindrome");
//                bool = false;
//            }
//        } else {
//            System.out.println("It is a " + i + "-Palindrome");
//            bool = false;
//        }
//        return bool;

        return false;
    }
}