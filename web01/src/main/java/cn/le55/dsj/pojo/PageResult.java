package cn.le55.dsj.pojo;

import jdk.nashorn.internal.ir.debug.PrintVisitor;

import java.util.List;

/**
 * Created by MaiBenBen on 2016/10/19.
 */
public class PageResult {

public  PageResult(int count,List<?> data)
{
    this.Count=count;
    this.Data=data;
}
    private int Count ;

    private  List<?> Data;
}
