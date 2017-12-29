package cn.ninggc.util.bean;

import cn.ninggc.util.IGson;
import com.google.gson.Gson;

public abstract class BaseBean implements IGson {
    public String toJson()  {
        return gson.toJson(this);
    }
}
