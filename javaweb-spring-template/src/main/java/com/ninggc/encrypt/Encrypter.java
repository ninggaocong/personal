package com.ninggc.encrypt;

/**
 * old: 持有加密的接口
 * new: 可以直接用接口持有
 */
@Deprecated
public class Encrypter implements IEncrypt {
    private IEncrypt encrypter;

    public Encrypter(IEncrypt e) {
        this.encrypter = e;
    }

    @Override
    public String encrypt(char[] msg) {
        return encrypter.encrypt(msg);
    }

    @Override
    public String decode(char[] msg) {
        return encrypter.decode(msg);
    }
}
