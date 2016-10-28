package cn.le55.dsj.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigInteger;
import java.util.Date;

public class Msg
{
    public   Long id;
    private  String title; 
    private  Long cateid; 
    private  String summary; 
    private  String pic1; 
    private  String pic2; 
    private  String pic3; 
    private  String pic4; 
    private  String pic5; 
    private  String body; 
    private  String author; 
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date ctime; 
    private  String bzdate; 
    private  String bzren; 
    private  String bzno; 
    private  String bzaddress; 
    private  String tvurl; 
    private  Integer hits; 
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date utime; 
    private  Integer oid; 

  public Long getId() { return id;} 
  public void setId(Long _id) { id = _id;} 


  public String getTitle() { return title;} 
  public void setTitle(String _title) { title = _title;} 


  public Long getCateid() { return cateid;} 
  public void setCateid(Long _cateid) { cateid = _cateid;} 


  public String getSummary() { return summary;} 
  public void setSummary(String _summary) { summary = _summary;} 


  public String getPic1() { return pic1;} 
  public void setPic1(String _pic1) { pic1 = _pic1;} 


  public String getPic2() { return pic2;} 
  public void setPic2(String _pic2) { pic2 = _pic2;} 


  public String getPic3() { return pic3;} 
  public void setPic3(String _pic3) { pic3 = _pic3;} 


  public String getPic4() { return pic4;} 
  public void setPic4(String _pic4) { pic4 = _pic4;} 


  public String getPic5() { return pic5;} 
  public void setPic5(String _pic5) { pic5 = _pic5;} 


  public String getBody() { return body;} 
  public void setBody(String _body) { body = _body;} 


  public String getAuthor() { return author;} 
  public void setAuthor(String _author) { author = _author;} 


  public Date getCtime() { return ctime;} 
  public void setCtime(Date _ctime) { ctime = _ctime;} 


  public String getBzdate() { return bzdate;} 
  public void setBzdate(String _bzdate) { bzdate = _bzdate;} 


  public String getBzren() { return bzren;} 
  public void setBzren(String _bzren) { bzren = _bzren;} 


  public String getBzno() { return bzno;} 
  public void setBzno(String _bzno) { bzno = _bzno;} 


  public String getBzaddress() { return bzaddress;} 
  public void setBzaddress(String _bzaddress) { bzaddress = _bzaddress;} 


  public String getTvurl() { return tvurl;} 
  public void setTvurl(String _tvurl) { tvurl = _tvurl;} 


  public Integer getHits() { return hits;} 
  public void setHits(Integer _hits) { hits = _hits;} 


  public Date getUtime() { return utime;} 
  public void setUtime(Date _utime) { utime = _utime;} 


  public Integer getOid() { return oid;} 
  public void setOid(Integer _oid) { oid = _oid;} 

}
