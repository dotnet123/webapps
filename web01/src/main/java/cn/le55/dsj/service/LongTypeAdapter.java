package cn.le55.dsj.service;

import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

import java.lang.reflect.Type;
import java.util.Date;

/**
 * Created by MaiBenBen on 2016/10/21.
 */
public    class LongTypeAdapter implements JsonSerializer<Long> {

    public JsonElement serialize(Long d, Type type, JsonSerializationContext context) {

        String value= String.valueOf( d);
        JsonPrimitive pri=new JsonPrimitive(value);
        return pri;
    }

}