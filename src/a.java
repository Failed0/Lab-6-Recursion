//Boolean bool = true;
//
//        if (s.length() == 1 || s.length() <= i) {
//        bool = true;
//        } else if (s.charAt(0) == s.charAt(s.length() - 1)) { //we get rid of the first and last
//        s = s.substring(1, s.length() - 1);
//        isKPalindrome(s, s.length());
//        } else if (s.charAt(1) == s.charAt(s.length() - 1) && i >= 0) { //comp second and last
//        s = s.substring(1, s.length() - 1);
//        i -= 1;
//        isKPalindrome(s, s.length());
//        } else if (s.charAt(0) == s.charAt(s.length() - 2) && i >= 0) { //cmp first to second to last
//        s = s.substring(0, s.length() - 2);
//        i -= 1;
//        isKPalindrome(s, s.length());
//        }
//        else if(s.charAt(1) == s.charAt(s.length() - 2) && i >=0){
//        s = s.substring(1, s.length() - 1);
//        i = i-2;
//        bool = true;
//        }
//        else {
//        System.out.println("It is not a " + i + "-Palindrome");
//        bool = false;
//        }