package org.example;

import java.util.Scanner;

public class Task_String {
    public static boolean checkPalindrome(String s) {
        if (s == null) return false;

        String cleaned = s.replaceAll("\\s+", "").toLowerCase();

        return isRecusrion(cleaned);
    }

    public static boolean isRecusrion(String s) {
        if (s.length() == 1) return true;

        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }

        return isRecusrion(s.substring(1, s.length() - 1));
    }

    public static int clculate_length(String s) {
        if (s == null || s.isEmpty()) return 0;
        return 1 + clculate_length(s.substring(1));
    }

    public static boolean isAnagram(String a, String b) {
        boolean check = false;

        if (a.length() != b.length()) return false;
        if (a.equals(b)) return true;

        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(i) == b.charAt(i)) check = true;
            }
        }

        return check;
    }

    public static int count_num(String s) {
        if (s == null || s.isEmpty()) return 0;
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') count++;
        }

        return count;
    }

    public static String get_upperCase(String s) {
        if (s == null || s.isEmpty()) return "";

        int spaceIndex = s.indexOf(" ");

        if (spaceIndex == -1) {
            return Character.toUpperCase(s.charAt(0)) + s.substring(1);
        }

        String firstWord = s.substring(0, spaceIndex);
        String Capitalized = Character.toUpperCase(firstWord.charAt(0)) + firstWord.substring(1);

        return Capitalized + " " + get_upperCase(s.substring(spaceIndex + 1));
    }

    public static String remove_sameletters(String s) {
        if (s == null || s.isEmpty()) return "";

        char frist_letter = s.charAt(0);
        String remaining = s.substring(1).replace(String.valueOf(frist_letter), "" );

        return frist_letter + remove_sameletters(remaining);
    }

    public static char finding_first_dublicate_letter(String s) {
        if (s == null || s.isEmpty()) return ' ';

        char frist_letter = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (frist_letter == s.charAt(i)) {
                return frist_letter;
            }
        }
        return finding_first_dublicate_letter(s.substring(1));
    }

    public static boolean isAllNumber(String s) {
        if (s == null || s.isEmpty()) return false;

        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /// 1
//        String s = "";
//        String s1 = "";
//        System.out.print("s = ");
//        s = sc.nextLine();
//
//        for (int i = s.length() - 1; i >= 0; i--) {
//            s1 += s.charAt(i);
//        }
//        System.out.println(s1);

        /// 2
//        System.out.println("Enter a string: ");
//        System.out.println(checkPalindrome(sc.nextLine()));

        /// 3
//        int n = 0;
//        System.out.println(clculate_length("salom"));

        /// 4
//        System.out.println(isAnagram("ali", "lar"));

        /// 5
//        System.out.println(count_num("Ali yaxshi bola"));

        /// 6
//        System.out.println(get_upperCase("salom ali meni ismim"));

        /// 7
//        System.out.println(remove_sameletters("Alli meni ismim a"));

        /// 8
//        System.out.println(finding_first_dublicate_letter("Mening yurtim O'zbekiston"));

        /// 9
//        System.out.println(isAllNumber("a123"));
    }
}
