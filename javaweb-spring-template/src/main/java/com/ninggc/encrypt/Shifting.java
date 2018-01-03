package com.ninggc.encrypt;

/**
 * 移位密码
 */
public class Shifting implements IEncrypt {

    private int key;

    public Shifting(int k) {
        this.key = k % 26;
    }

    @Override
    public String encrypt(char[] msg) {
        for (int i = 0; i < msg.length; i++) {
            msg[i] += key;
        }
        return String.valueOf(msg);
    }

    @Override
    public String decode(char[] msg) {
        return null;
    }

    public static void main(String[] args) {
        System.out.println(new Shifting(28).encrypt("123"));
    }
}
