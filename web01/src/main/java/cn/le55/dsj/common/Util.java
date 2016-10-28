package cn.le55.dsj.common;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

/**
 * Created by MaiBenBen on 2016/10/22.
 */
public class Util {


    public static long getNewId() {

        String mm= new SimpleDateFormat("yyyyMMddHHmmssSSS").format(new Date());

        return Long.parseLong(mm);
       // return str2Num(UUID.randomUUID().toString().replaceAll("\\-", ""));
    }

    private static long str2Num(String str){
        char[] array = str.toCharArray();

        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
            if(array[i] != '0'){
                str = str.substring(i);
                break;
            }
        }
        return Long.parseLong(str);
    }
}
