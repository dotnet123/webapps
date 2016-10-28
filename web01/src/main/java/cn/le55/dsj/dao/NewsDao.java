package cn.le55.dsj.dao;

import java.util.List;
import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;
import cn.le55.dsj.pojo.News;

 @DB(table = "dsj_news") 


 public interface NewsDao { 

 String columns = "  id, summary, ctime, body, cateid, title "; 

 @SQL("insert into #table(" + columns + ") values(  :1.id, :1.summary, :1.ctime, :1.body, :1.cateid, :1.title )") 
 public int insert(News news);


 @SQL("update #table set  summary=:1.summary, ctime=:1.ctime, body=:1.body, cateid=:1.cateid, title=:1.title where id=:1.id") 
 public int update(News news);


 @SQL("delete from #table where id in (:1)") 
 public int delete(long... ids);

     @SQL("select count(id) from #table " +
             "where 1=1 " +
             " #if(:1.ids!=null) and id in (:1.ids)  #end " +
             " #if(:1.title!='' ) and title like  :1.title  #end  " +
             " order by :1.orderField :1.orderDirection " +
             " #if(:1.take !=null && :1.skip !=null)  limit :1.skip, :1.take  #end  " +
             " ")
  public int queryCount(NewsQuery query);

 @SQL("select " + columns + " from #table " +
       "where 1=1 " +
       " #if(:1.ids!=null) and id in (:1.ids)  #end " +
       " #if(:1.title!='' ) and title like  :1.title  #end  " +
       " order by :1.orderField :1.orderDirection " +
       " #if(:1.take !=null && :1.skip !=null)  limit :1.skip, :1.take  #end  " +
       " ")
 public List<News> query(NewsQuery query);
  
  
 } 
  
