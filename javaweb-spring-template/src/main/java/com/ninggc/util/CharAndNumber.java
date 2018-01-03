package com.ninggc.util;

/**
 * 将数字和字母相互转换的类
 * 因为加密的需求，全部转换为大写字母
 */
public class CharAndNumber {
    public static void main(String[] args) {
        System.out.println((int)'a');
        System.out.println((int)'z');
        System.out.println((int)'A');
        System.out.println((int)'Z');
    }

    public static int chatToNumber(char c) {
        if (c >= 'A' && c <= 'Z') {
            return c - 'A';
        } else if (c >= 'a' && c <= 'z') {
            return c - 'a';
        } else {
            throw new IllegalArgumentException("Please enter character.");
        }
    }

    /**
     * @param n [0, 25]
     * @return 大写字母
     */
    public static char numberToChar(int n) {
        if (n < 0 || n >= 26) {
            throw new IllegalArgumentException("Please enter legal argument.");
        } else {
            return (char) (n + 65);
        }
    }

}
