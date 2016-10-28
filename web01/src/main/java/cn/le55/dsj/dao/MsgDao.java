package cn.le55.dsj.dao;

import cn.le55.dsj.pojo.Msg;

import java.util.List;

import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;
import cn.le55.dsj.pojo.Msg;

@DB(table = "dsj_msg")


public interface MsgDao {


    String columns = "  id, title, cateid, summary, pic1, pic2, pic3, pic4, pic5, body, author, ctime, bzdate, bzren, bzno, bzaddress, tvurl, hits, utime, oid ";

    @SQL("insert into #table(" + columns + ") values(  :1.id, :1.title, :1.cateid, :1.summary, :1.pic1, :1.pic2, :1.pic3, :1.pic4, :1.pic5, :1.body, :1.author, :1.ctime, :1.bzdate, :1.bzren, :1.bzno, :1.bzaddress, :1.tvurl, :1.hits, :1.utime, :1.oid )")
    public int insertMsg(Msg msg);


    @SQL("update #table set  title=:1.title, cateid=:1.cateid, summary=:1.summary, pic1=:1.pic1, pic2=:1.pic2, pic3=:1.pic3, pic4=:1.pic4, pic5=:1.pic5, body=:1.body, author=:1.author, ctime=:1.ctime, bzdate=:1.bzdate, bzren=:1.bzren, bzno=:1.bzno, bzaddress=:1.bzaddress, tvurl=:1.tvurl, hits=:1.hits, utime=:1.utime, oid=:1.oid where id=:1.id")
    public int updateMsg(Msg msg);


    @SQL("delete from #table where id in (:1)")
    public int deleteMsg(long... ids);


    @SQL("select " + columns + " from #table where id in (:1)")

    public List<Msg> getMsg(long... ids);


    @SQL("select " + columns + " from #table where 1=1 " +
            "#if (:1.ids!=null) and id in (:1.ids)  #end " +
            "#if (:1.cateid!=null) and cateid in (:1.cateid)  #end " +
            "#if (:1.title!='' ) and title like  :1.title  #end  " +
            " order by :1.orderField :1.orderDirection " +
            "#if (:1.take !=null && :1.skip !=null)  limit :1.skip, :1.take  #end  " +
            " ")

    public List<Msg> query(MsgQuery query);


    @SQL("select count(id) from #table where 1=1 " +
            "#if (:1.ids!=null) and id in (:1.ids)  #end " +
            "#if (:1.cateid!=null) and cateid in (:1.cateid)  #end " +
            "#if (:1.title!='' ) and title like  :1.title  #end  " +
            " ")

    public int queryCount(MsgQuery query);


}
