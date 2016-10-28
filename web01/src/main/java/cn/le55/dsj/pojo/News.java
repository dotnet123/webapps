package cn.le55.dsj.pojo;

import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;

public class News {
    private  Long id; 
    private  String summary; 
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private  Date ctime; 
    private  String body; 
    private  Long cateid; 
    private  String title;

  public Long getId() { return id;} 
  public void setId(Long _id) { id = _id;} 


  public String getSummary() { return summary;} 
  public void setSummary(String _summary) { summary = _summary;} 


  public Date getCtime() { return ctime;} 
  public void setCtime(Date _ctime) { ctime = _ctime;} 


  public String getBody() { return body;} 
  public void setBody(String _body) { body = _body;} 


  public Long getCateid() { return cateid;} 
  public void setCateid(Long _cateid) { cateid = _cateid;} 


  public String getTitle() { return title;}
  public void setTitle(String _title) { title = _title;}

}



