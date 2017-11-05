package com.ninggc.individual.bean;

import com.google.gson.Gson;

public interface IGson {
    Gson gson = new Gson();

    public default String toJson()  {
        return gson.toJson(this);
    }
}
