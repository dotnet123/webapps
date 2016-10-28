package cn.le55.dsj.dao;

import java.util.List;
import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;
import cn.le55.dsj.pojo.KV.KV;

 @DB(table = "dsj_kv") 


 public interface KVDao { 


 String columns = "  id, mykey, myvalue "; 

 @SQL("insert into #table(" + columns + ") values( :1.id, :1.mykey, :1.myvalue )")
 public int insertKV(KV kv); 


 @SQL("update #table set  mykey=:1.mykey, myvalue=:1.myvalue where id=:1.id") 
 public int updateKV(KV kv); 


 @SQL("delete from #table where id <> :1 and mykey = :2")
 public int deleteKV(long id,String key);


 @SQL("select " + columns + " from #table where mykey = :1")

 public KV getKV(String key);
  
  
  


 @SQL("select " + columns + " from #table where 1=1 "+
  "#if (:1.ids!=null) and id in (:1.ids)  #end " + 
 "#if (:1.title!='' ) and title like  :1.title  #end  " +  
 " order by :1.orderField :1.orderDirection " + 
 "#if (:1.take !=null && :1.skip !=null)  limit :1.skip, :1.take  #end  " +
 " ") 
 public List<KV> query(KVQuery query); 
  
  


 @SQL("select count(1) from #table where 1=1 "+
  "#if (:1.ids!=null) and id in (:1.ids)  #end " + 
 "#if (:1.title!='' ) and title like  :1.title  #end  " +  
 " ") 
 public int queryCount(KVQuery query); 
  
  
 } 
  
