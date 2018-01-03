package com.ninggc.encrypt;

import java.util.ArrayList;

/**
 * 置换密码
 */
public class Replacement implements IEncrypt {
    private final int[] key;

    public Replacement(int[] k) {
        this.key = k;
    }

    @Override
    public String encrypt(char[] msg) {
        //length是key长度的整数倍
        int length = (msg.length / key.length + 1) * key.length;
        ArrayList<Character> result = new ArrayList<>(length);
        for (int i = 0; i < length; i++) {
            //多余的位置置0
            result.add(i, (i >= msg.length ? 0 : msg[i]));
        }

        for (int i = 0; i < msg.length; ) {
            for (int j = 0; j < key.length; j++) {
                if ((i + key[j] - 1) >= msg.length) {
                    result.set(i + j, '0');
                } else {
                    //因为key是从1开始的，所以要减去1
                    result.set(i + j, msg[i + key[j] - 1]);
                }
            }
            //跳过已经加密过的数据
            i += key.length;
        }

        return String.valueOf(result);
    }

    @Override
    public String decode(char[] msg) {
        return null;
    }

    public static void main(String[] args) {
        String test = "12345671234567123";
        IEncrypt encrypt = new Replacement(new int[]{3, 5, 1, 6, 4, 2, 7});
        System.out.println(encrypt.encrypt(test));
    }
}
