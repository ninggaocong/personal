package com.ninggc.factory.bean;

import com.google.gson.Gson;

public abstract class BaseBean {
    protected Gson gson = new Gson();

    public String toJson()  {
        return gson.toJson(this);
    }
}
