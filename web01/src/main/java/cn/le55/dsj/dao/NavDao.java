package cn.le55.dsj.dao;

import cn.le55.dsj.pojo.Msg;
import java.util.List;

import cn.le55.dsj.pojo.Nav;
import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;

 @DB(table = "dsj_nav")


 public interface NavDao { 


 String columns = "  id, name, parentid, css, url, target, taxis, language "; 

 @SQL("insert into #table(" + columns + ") values(  :1.id, :1.name, :1.parentid, :1.css, :1.url, :1.target, :1.taxis, :1.language )") 
 public int insertNav(Nav nav); 


 @SQL("update #table set  name=:1.name, parentid=:1.parentid, css=:1.css, url=:1.url, target=:1.target, taxis=:1.taxis, language=:1.language where id=:1.id") 
 public int updateNav(Nav nav);


 @SQL("delete from #table where id in (:1)") 
 public int deleteNav(long... ids); 


 @SQL("select " + columns + " from #table  where parentid in (:1)")
 public List<Nav> getNav(int... ids);
  
  
 } 
  
