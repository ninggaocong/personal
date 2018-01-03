package com.ninggc.encrypt;

import com.ninggc.util.CharAndNumber;

import java.util.ArrayList;

/**
 * 置换密码
 */
public class Vigenere implements IEncrypt {
    private final int[] key;

    public Vigenere(int[] k) {
        this.key = k;
    }

    @Override
    public String encrypt(char[] msg) {
        for (int i = 0; i < msg.length; ) {
            for (int j = 0; j < key.length; j++) {
                if ((i + j) >= msg.length) {
                    return String.valueOf(msg);
                }
                char c = CharAndNumber.numberToChar((CharAndNumber.chatToNumber(msg[i + j]) + key[j]) % 26);
                msg[i + j] = c;
            }
            //跳过已经加密过的数据
            i += key.length;
        }

        return String.valueOf(msg);
    }

    @Override
    public String decode(char[] msg) {
        return null;
    }

    public static void main(String[] args) {
        String test = "abcdefgz";
        IEncrypt encrypt = new Vigenere(new int[]{3, 5, 1, 6, 4, 2, 7});
        System.out.println(encrypt.encrypt(test));
    }
}
