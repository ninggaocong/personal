package com.ninggc.encrypt;

public interface IEncrypt {
    default String encrypt(String msg) {
        return encrypt(msg.toCharArray());
    }

    String encrypt(char[] msg);

    default String decode(String msg) {
        return decode(msg.toCharArray());
    }

    String decode(char[] msg);
}
