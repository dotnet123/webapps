package cn.le55.dsj.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.Date;

/**
 * Created by MaiBenBen on 2016/10/22.
 */
public class GsonFactory {

    public static final Gson gson ;
    static {

        GsonBuilder builder=new GsonBuilder();
        builder.registerTypeHierarchyAdapter(Long.class, new LongTypeAdapter());
        builder.registerTypeHierarchyAdapter(Date.class, new DateTypeAdapter());
        gson=builder.create();
    }
}
