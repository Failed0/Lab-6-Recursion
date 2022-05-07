package uk.ac.soton.ecs.comp1206.labtestlibrary.interfaces.recursion;

import java.util.Arrays;
import java.util.List;

public class KPalindrome implements PalindromeChecker {
    @Override
    public boolean isKPalindrome(String s, int i) {

        if (s.length() < 2 || s.length() <= i) {
            return true;

        }
        if (s.charAt(0) == s.charAt(s.length() - 1) && i >= 0) {
            return isKPalindrome(s.substring(1, s.length() - 1), i);
        } else {
            if (i == 0) {
                return false;
            } else {
                if (isKPalindrome(s.substring(0, s.length() - 1), i-1) && i >= 0) {
                    return true ;
                } else {
                    return isKPalindrome(s.substring(1, s.length()), i-1 ) && i >= 0;

                }
//                else // if (s.charAt(1) == s.charAt(s.length() - 2))
//                     {
//                    return isKPalindrome(s.substring(2, s.length() - 2), i);
            }
        }
    }

}

