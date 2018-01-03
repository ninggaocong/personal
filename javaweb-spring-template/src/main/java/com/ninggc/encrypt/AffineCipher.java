package com.ninggc.encrypt;

import com.ninggc.util.CharAndNumber;

import java.util.ArrayList;

/**
 * 仿射密码
 */
public class AffineCipher implements IEncrypt {
    private int keyA;
    private int keyB;

    public AffineCipher(int kA, int kB) {
        this.keyA = kA;
        this.keyB = kB;
    }

    @Override
    public String encrypt(char[] msg) {
        final int length = msg.length;
        ArrayList<Character> list = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            list.add(msg[i]);
        }

        for (int i = 0; i < length; i++) {
            //字符转换成0-25的数字
            int plaintext = CharAndNumber.chatToNumber(list.get(i));
            int ciphertext  = (keyA * plaintext + keyB) % 26;
            list.set(i, CharAndNumber.numberToChar(ciphertext));
        }

        return String.valueOf(list);
    }

    @Override
    public String decode(char[] msg) {
        return null;
    }

    public static void main(String[] args) {
        String test = "abcdefg";
        AffineCipher affineCipher = new AffineCipher(5, 4);
        System.out.println(affineCipher.encrypt(test));
    }
}
