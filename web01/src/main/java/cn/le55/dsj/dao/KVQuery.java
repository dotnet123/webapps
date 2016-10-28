package cn.le55.dsj.dao;
import cn.le55.dsj.pojo.*;
import cn.le55.dsj.pojo.KV.KV;

public class KVQuery extends AbsQuery<KV> {

 private String title;

 public String getTitle() {

       if (title == null || title == "") return ""; 
       return "%"+title+"%";

 } 
 public void setTitle(String _title) { 

       title=_title; 

 } 
 } 
