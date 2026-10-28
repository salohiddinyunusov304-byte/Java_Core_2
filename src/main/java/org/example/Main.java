package org.example;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /// String -> ummutable, thread-safe

        /// literali bn yaratilgan string string pool da refer qilib qoyadi har ikkisini
        String s1 = "Hello world";
        String s2 = "Hello world";

        /// new bn yaratilsa header dan yangi joy
        String s3 = new String("Hello world");

        /// == xotiradagi manzili, equals qiymatni
        s2.concat(s1); // string immutable
        System.out.println(s2);
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1 == s3);

        /// StringBuffer -> mutable, thread-safe
        StringBuffer buffer = new StringBuffer("Hello world ");
        buffer.append("!!!!");
        System.out.println(buffer);

        /// StringBuilder -> mutable, thread-unsafe (very fast)
        StringBuilder builder = new StringBuilder("Hello world ");
        builder.append("!!!!");
        System.out.println(builder);

        /// Methods String
        System.out.println(s3);
        System.out.println(s3.substring(1, 4));

        /// Logic
        String ss = "Alo"; // bu holatda Alo xotiradan ochmadi hali, uni referini prosta BB ga yonaltirib qoydi
        ss = "BB";
        System.out.println(ss + "alo");

        /// StringTokenazer -> Sozlarni bolib yuboradi
        StringTokenizer tokenizer1 = new StringTokenizer("Hello World !!!");
        StringTokenizer tokenizer = new StringTokenizer("Hello World !!!", "!", true);

        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
        System.out.println(tokenizer1.countTokens());

        /// Array
        // way-1
        int[] a =  new int[3];
        a[0] = 2;
        a[1] = 3;
        a[2] = 1;
        System.out.println(Arrays.toString(a));

        // way-2
        String[] s = {"ali", "Vali"};
        System.out.println(Arrays.toString(s));

        // logic
        int[] a1 = {1, 2, 3};
        System.out.println(a[0] == a1[0]);

        // sort
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
        Arrays.sort(a,1,2);
        System.out.println(Arrays.toString(a));
        Arrays.fill(a,1);
        System.out.println(Arrays.toString(a));

        // copy
        int[] copy = Arrays.copyOf(a, 5);
        System.out.println(Arrays.toString(copy));

        // equals
        System.out.println(Arrays.equals(a,copy));

        // deep equals
        int[][] i = {{1, 2}, {3, 4}};
        int[][] j = {{1, 2}, {3, 4}};
        System.out.println(Arrays.deepEquals(i, j));
    }
}